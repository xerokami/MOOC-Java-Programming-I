import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a name (quit to exit)");
            String userName = scan.nextLine();

            if (userName.equals("quit")) {
                break;
            }

            nameList.add(userName);
        }
        System.out.println(nameList.get(0));
        System.out.println(nameList.get(nameList.size() - 1));
    }
}
