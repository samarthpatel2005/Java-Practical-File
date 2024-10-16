import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pra_30 {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java P30 <source file> <destination file>");
            return;
        }
        String sourceFile = args[0];
        String destinationFile = args[1];
        try (FileReader fr = new FileReader(sourceFile); FileWriter fw = new FileWriter(destinationFile)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("Data copied from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("23DCS089_Samarth");
    }
}
