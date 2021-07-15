import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumOfYears = 0;
        int yearCount = 0;
        double average = 0.0;
        int longest = 0;
        String nameOfLongest = "";

        while (true) {
            System.out.println("Enter a string:");
            String userString = scan.nextLine();

            if (userString.isEmpty()) {
                break;
            }

            String[] split = userString.split(",");

            if (longest < Integer.valueOf(split[0].length())) {
                longest = split[0].length();
                nameOfLongest = split[0];
            }
            yearCount++;
            sumOfYears += Integer.valueOf(split[1]);
        }
        average = 1.0 * sumOfYears / yearCount;
        System.out.println("Longest name: " + nameOfLongest);
        System.out.println("Average of the birth years: " + average);
    }
}