import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ask the user for the number of times that the phrase will be printed
        // use the while command to call the method a suitable number of times
        System.out.println("How many times?");
        int times = Integer.valueOf(scan.nextLine());

        for (int i = 1; i <= times; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
