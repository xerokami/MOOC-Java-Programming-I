import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rootPath = "Part4-3.10-FilesAndReadingData-StoringRecords";

        System.out.println("Filename:");
        String file = scan.nextLine();
        String absolutePath = rootPath + "/" + file;

        ArrayList<Person> records = readRecordsFromFile(absolutePath);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String absolutePath) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records

        try (Scanner readFile = new Scanner(Paths.get(absolutePath))) {
            while (readFile.hasNextLine()) {
                String[] parts = readFile.nextLine().split(",");

                if (parts.equals("")) {
                    continue;
                }

                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                persons.add(new Person(name, age));
            }

        } catch (Exception error) {
            System.out.println("Error finding: " + error.getMessage());
        }

        return persons;
    }
}