import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rootPath = "Part4-3.06-FilesAndReadingData-GuestListFromAFile";

        System.out.println("Name of the file:");
        String file = scan.nextLine();
        String filePath = rootPath + "/" + file;

        ArrayList<String> list = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(filePath))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                list.add(line);
            }
        } catch (Exception error) {
            System.out.println("Error finding: " + error.getMessage());
        }

        System.out.println("Enter names (empty line quits)");

        while(true) {
            String name = scan.nextLine();

            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
    }
}
