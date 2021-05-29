import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface Conversion {
    public void convertToJSON(String jsonFile) throws IOException, ParseException;
    public void convertToYAML(String yamlFile) throws IOException;
}
