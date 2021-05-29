import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.yaml.snakeyaml.Yaml;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;

public class DataFormatConversion implements Conversion {

    private String oldPath;
    private long oldSize = 0, newSize = 0;
    public int successCount = 0, failureCount = 0;
    private List<String> jsonFiles = new ArrayList<>();
    private List<String> yamlFiles = new ArrayList<>();

    public void convertFiles(String path) throws IOException, ParseException {
        oldPath = path;

        File f = new File(oldPath);
        String[] filesName = f.list();

        File convertedPath = new File(oldPath + File.separator + "Converted");
        if(!convertedPath.exists()) {
            convertedPath.mkdir();
        }

        if(filesName != null) {
            for (String s : filesName) {
                if ((s.length() > 5) && (s.toLowerCase(Locale.ROOT).substring(s.length() - 5).contains(".json"))) {
                    jsonFiles.add(s);
                } else if ((s.length() > 5) && (s.toLowerCase(Locale.ROOT).substring(s.length() - 5).contains(".yaml"))) {
                    yamlFiles.add(s);
                }
            }
        }

        for(String json : jsonFiles){
            convertToJSON(json);
        }
        for(String yaml : yamlFiles){
            convertToYAML(yaml);
        }
    }

    public void addToLog(String fileName, long duration, boolean isConverted) throws IOException {
        String newFileName = "";

        File logFile = new File(oldPath + File.separator + "Result.log");

        if(!logFile.exists()){
            try{
                logFile.createNewFile();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
        FileWriter fw = new FileWriter(oldPath + File.separator + "Result.log", true);
        BufferedWriter bw = new BufferedWriter(fw);
        if(isConverted) {
            successCount++;
            if(fileName.toLowerCase(Locale.ROOT).substring(fileName.length()-5).contains(".json")) {
                newFileName = fileName.substring(0, fileName.length() - 5).concat(".yaml");
            }
            else{
                newFileName = fileName.substring(0, fileName.length() - 5).concat(".json");
            }
            bw.write("Conversion " + fileName + " -> " + newFileName + "\n");
            bw.write("Duration: " + duration + "\n");
            bw.write("Old size: " + oldSize + " -> " + "New size: " + newSize + "\n");
        }
        else{
            failureCount++;
            bw.write("Conversion failure");
        }
        bw.newLine();
        bw.close();
    }

    public boolean createConvertedFile(String fileName, String fileExtension, String data) throws IOException {
        if(!(new File(oldPath + File.separator + "Converted").exists())) {
            new File(oldPath + File.separator + "Converted").mkdir();
        }
        File convertedFile = new File(oldPath + File.separator + "Converted"
                + File.separator + fileName.substring(0, fileName.length() - 5) + fileExtension);

        if(!convertedFile.exists()){
            try{
                convertedFile.createNewFile();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }

        FileWriter fw = new FileWriter(oldPath + File.separator + "Converted"
                + File.separator + fileName.substring(0, fileName.length() - 5) + fileExtension,false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(data);
        bw.close();

        newSize = convertedFile.length();

        return (newSize > 0);
    }

    @Override
    public void convertToJSON(String jsonFileName) throws IOException, ParseException {
        long start = System.currentTimeMillis();
        FileReader jsonFile = new FileReader(oldPath + File.separator + jsonFileName);
        oldSize = new File(oldPath + File.separator + jsonFileName).length();

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(jsonFile);
        String stringJson = obj.toString();
        JsonNode jsonNode = new ObjectMapper().readTree(stringJson);
        String stringYaml = new YAMLMapper().writeValueAsString(jsonNode);

        boolean isConverted = createConvertedFile(jsonFileName, ".yaml", stringYaml);

        long duration = System.currentTimeMillis() - start;
        addToLog(jsonFileName, duration, isConverted);
    }

    @Override
    public void convertToYAML(String yamlFileName) throws IOException {
        long start = System.currentTimeMillis();
        oldSize = new File(oldPath + File.separator + yamlFileName).length();

        StringBuilder yamlStringBuilder = new StringBuilder();
        try(Stream<String> stream = Files.lines( Paths.get(oldPath + File.separator + yamlFileName), StandardCharsets.UTF_8)){
            stream.forEach(s -> yamlStringBuilder.append(s).append("\n"));
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        String yamlString = yamlStringBuilder.toString();

        ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
        Object jamlText = yamlReader.readValue(yamlString, Object.class);
        ObjectMapper jsonWriter = new ObjectMapper();
        String jsonString = jsonWriter.writeValueAsString(jamlText);

        boolean isConverted = createConvertedFile(yamlFileName, ".json", jsonString);

        long duration = System.currentTimeMillis() - start;
        addToLog(yamlFileName, duration, isConverted);
    }
}
