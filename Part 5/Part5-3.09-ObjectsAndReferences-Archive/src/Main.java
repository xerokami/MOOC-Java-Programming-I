import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop");
            String promptedIdentifier = scan.nextLine();

            if (promptedIdentifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String promptedName = scan.nextLine();

            if (promptedName.isEmpty()) {
                break;
            }

            Archive archive = new Archive(promptedIdentifier, promptedName);

            if (!(archives.contains(archive))) {
                archives.add(archive);
            }
        }

        System.out.println("==Items==");
        for (Archive archive: archives) {
            System.out.println(archive);
        }
    }
}
