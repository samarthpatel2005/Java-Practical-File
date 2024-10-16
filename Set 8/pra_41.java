import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class pra_41 {

    private static final HashSet<String> keywords = new HashSet<>();

    static {
        String[] keywordArray = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
            "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
            "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
            "interface", "long", "native", "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while"
        };
        for (String keyword : keywordArray) {
            keywords.add(keyword);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the Java source file: ");
        String filePath = scanner.nextLine();

        try {
            File file = new File(filePath); // Corrected: Using File object to read the file
            Scanner fileScanner = new Scanner(file);
            int keywordCount = 0;

            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                if (keywords.contains(word)) {
                    keywordCount++;
                }
            }

            System.out.println("Number of Java keywords in the file: " + keywordCount);
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }

        System.out.println("23DCS089_Samarth");
    }
}

