import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<TelevisionProgram> televisionList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String televisionName = scan.nextLine();

            if (televisionName.isEmpty()) {
                break;
            }

            System.out.println("Duration: ");
            int televisionDuration = Integer.valueOf(scan.nextLine());

            televisionList.add(new TelevisionProgram(televisionName, televisionDuration));
        }

        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scan.nextLine());

        for (TelevisionProgram television: televisionList) {
            if (television.getDuration() <= maxDuration ) {
                System.out.println(television.getName() + ", " + television.getDuration() + " minutes");
            }
        }
    }
}
