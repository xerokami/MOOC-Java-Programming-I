import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ToDoList list;
    private Scanner scan;

    public UserInterface(ArrayList<ToDoList> list, Scanner scan) {
        this.list = new ToDoList();
        this.scan = new Scanner(System.in);
    }

    public void start() {
        boolean toLoop = true;

        while(toLoop) {
            System.out.println("Command:");
            String userCommand = scan.nextLine();

            switch(userCommand) {
                case "stop":
                    toLoop = false;
                    break;
                case "add":
                    System.out.println("To add:");
                    String added = scan.nextLine();
                    list.add(added);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int removed = Integer.valueOf(scan.nextLine());
                    list.remove(removed);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + userCommand);
            }
        }
    }
}
