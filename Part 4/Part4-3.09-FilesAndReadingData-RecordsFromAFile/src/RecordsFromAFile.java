import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rootPath = "Part4-3.09-FilesAndReadingData-RecordsFromAFile";

        System.out.println("Name of the file:");
        String fileName = scan.nextLine();

        String absolutePath = rootPath + "/" + fileName;

        try (Scanner readFile = new Scanner(Paths.get(absolutePath))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age > 1) {
                    System.out.println(name + ", " + "age: " + age + " years");
                } else {
                    System.out.println(name + ", " + "age: " + age + " year");
                }
            }

        } catch (Exception error) {
            System.out.println("Error finding: " + error.getMessage());
        }
    }
}
