import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private GradeRegister grades;

    public UserInterface(GradeRegister grades, Scanner scan) {
        this.scan = scan;
        this.grades = grades;
    }

    public void start() {
        readGradePoints();
        System.out.println("");
        printGrades();
    }

    public void readGradePoints() {
        while (true) {
            System.out.print("Points: ");
            String userInput = scan.nextLine();

            if (userInput.equals("")) {
                break;
            }

            int points = Integer.valueOf(userInput);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.grades.addGradeBasedOnPoints(points);
        }
    }

    public void printGrades() {
        int grade = 5;

        while (grade >= 0) {
            int stars = this.grades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade -= 1;
        }
        System.out.println("The average of points: " + grades.averageOfPoints());
        System.out.println("The average of grades: " + grades.averageOfGrades());
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}
