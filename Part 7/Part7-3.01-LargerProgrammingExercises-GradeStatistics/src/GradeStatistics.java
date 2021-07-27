import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> points;
    private int sumOfPoints;
    private int pointsCount;
    private int sumOfPassingPoints;
    private int passingPointsCount;

    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.sumOfPoints = 0;
        this.pointsCount = 0;
        this.sumOfPassingPoints = 0;
        this.passingPointsCount = 0;
    }

    public void addPoint(int point) {
        if (point > 0 && point < 101) {
            this.points.add(point);
            sumOfPoints += point;
            pointsCount++;
        }

        if (point > 49 && point < 101) {
            sumOfPassingPoints += point;
            passingPointsCount++;
        }
    }

    public String pointAverage() {
        String pointAverageStr = "Point average (all): ";
        double pointAverage = 1.0 * sumOfPoints / pointsCount;

        return pointAverageStr + pointAverage;
    }

    public String pointAveragePassingGrade() {
        String passingPointAvgStr = "Point average (passing): ";

        if (!(passingPointsCount == 0)) {
            double passingPointAverage = 1.0 * sumOfPassingPoints / passingPointsCount;
            return passingPointAvgStr + passingPointAverage;
        } else {
            return passingPointAvgStr + "-";
        }
    }

    public String passingPercentage() {
        String passingPercentageStr = "Pass percentage: ";
        double passingPercentage = 100 * passingPointsCount / pointsCount;

        return passingPercentageStr + passingPercentage;
    }

    public void gradeDistribution() {
        int[] gradeDistributionArr = new int[6];

        for (int point: points) {
            if (point >= 90) {
                gradeDistributionArr[0]++;
            } else if (point <= 89 && point > 79) {
                gradeDistributionArr[1]++;
            } else if (point <= 79 && point > 69) {
                gradeDistributionArr[2]++;
            } else if (point <= 69 && point > 59) {
                gradeDistributionArr[3]++;
            } else if (point <= 59 && point > 49) {
                gradeDistributionArr[4]++;
            } else if (point <= 49) {
                gradeDistributionArr[5]++;
            }
        }

        System.out.println("Grade distribution:");
        int gradeDistributionIndex = 5;

        for (int grade: gradeDistributionArr) {
            System.out.print(gradeDistributionIndex + ": ");

            for (int i = 0; i < grade; i++) {
                System.out.print("*");
            }

            System.out.println();
            gradeDistributionIndex--;
        }
    }

    public void printGrades() {
        System.out.print("Point average (all): " + pointAverage() + "\n"
                + "Point average (passing): " + pointAveragePassingGrade() + "\n"
                + "Pass percentage: " + passingPercentage() + "\n");
        gradeDistribution();
    }
}
