import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rootPath = "Part4-3.08-FilesAndReadingData-NumbersFromAFile";

        System.out.println("File?");
        String file = scan.nextLine();
        String absolutePath = rootPath + "/" + file;

        System.out.println("Lower bound?");
        int lowerBound = Integer.valueOf(scan.nextLine());

        System.out.println("Upper bound?");
        int upperBound = Integer.valueOf(scan.nextLine());

        try (Scanner readFile = new Scanner(Paths.get(absolutePath))) {

            int numCount = 0;
            while (readFile.hasNextLine()) {
                int numLine = Integer.valueOf(readFile.nextLine());

                if (numLine >= lowerBound && numLine <= upperBound) {
                    numCount++;
                }
            }

            System.out.println("Numbers: " + numCount);

        } catch (Exception error) {
            System.out.println("Error finding: " + error.getMessage());
        }
    }
}
