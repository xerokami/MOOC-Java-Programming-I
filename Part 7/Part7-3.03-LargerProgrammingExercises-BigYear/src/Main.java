import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdDatabase birdList = new BirdDatabase();

        UserInterface ui = new UserInterface(scan, birdList);
        ui.start();
    }
}
