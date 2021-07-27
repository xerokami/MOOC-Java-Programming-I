import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private GradeStatistics points;

    public UserInterface(Scanner scan, GradeStatistics points) {
        this.scan = scan;
        this.points = points;
    }

    public void start() {
        boolean looping = true;
        System.out.println("Enter point totals, -1 stops:");

        while(looping) {
            int pointToAdd = Integer.valueOf(scan.nextLine());

            if (pointToAdd == -1) {
                break;
            }

            points.addPoint(pointToAdd);
        }

        points.printGrades();
    }
}
