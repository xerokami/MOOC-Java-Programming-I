import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rootPath = "Part4-3.07-FilesAndReadingData-IsItInTheFile";
        boolean found = false;

        System.out.println("Name of the file:");
        String file = scan.nextLine();
        String filePath = rootPath + "/" + file;

        System.out.println("Search for:");
        String searchFor = scan.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(filePath))) {

            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();

                if (searchFor.contains(line)) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

        } catch (Exception error) {
            System.out.println("Error finding: " + error.getMessage());
        }
    }
}
