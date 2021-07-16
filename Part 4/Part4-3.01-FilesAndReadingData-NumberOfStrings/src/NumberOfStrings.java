import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineCount = 0;

        while (true) {
            String line = scan.nextLine();

            if (line.equals("end")) {
                break;
            }

            lineCount++;
        }
        System.out.println(lineCount);
    }
}
