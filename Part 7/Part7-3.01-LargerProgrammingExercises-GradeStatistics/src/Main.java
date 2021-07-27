import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GradeStatistics points = new GradeStatistics();

        UserInterface ui = new UserInterface(scan, points);
        ui.start();
    }
}
