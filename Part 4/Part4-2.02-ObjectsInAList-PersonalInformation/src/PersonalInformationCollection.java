import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<PersonalInformation> list = new ArrayList<>();

        while (true) {
            System.out.println("First name: ");
            String firstName = scan.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.println("Last name: ");
            String lastName = scan.nextLine();

            System.out.println("Identification number: ");
            String identificationNum = scan.nextLine();

            list.add(new PersonalInformation(firstName, lastName, identificationNum));
        }

        for (PersonalInformation person: list) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
