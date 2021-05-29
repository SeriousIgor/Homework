import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class ConversionRun {
    public static void main(String[] args) throws IOException, ParseException {
        DataFormatConversion dfc = new DataFormatConversion();
        Scanner scanner = new Scanner(System.in);
        String path;

        System.out.println("Enter path to directory");
        path = scanner.next();

        dfc.convertFiles(path);
    }
}
