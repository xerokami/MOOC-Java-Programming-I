import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner readFile = new Scanner(System.in);
        String rootPath = "Part4-3.05-FilesAndReadingData-PrintingASpecifiedFile";

        System.out.println("Which file should have its contents printed?");
        String fileToBePrinted = readFile.nextLine();
        String absolutePath = rootPath + "/" + fileToBePrinted;

        try (Scanner scanner = new Scanner(Paths.get(absolutePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception error) {
            System.out.println("Error finding: " + error.getMessage());
        }
    }
}
