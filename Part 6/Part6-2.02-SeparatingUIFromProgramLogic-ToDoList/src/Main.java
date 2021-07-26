import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ToDoList> list = new ArrayList<ToDoList>();
        Scanner scan = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scan);
        ui.start();
    }
}
