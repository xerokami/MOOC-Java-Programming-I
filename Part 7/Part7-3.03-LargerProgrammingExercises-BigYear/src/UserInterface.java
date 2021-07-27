import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private BirdDatabase birdList;

    public UserInterface(Scanner scan, BirdDatabase birdList) {
        this.scan = scan;
        this.birdList = birdList;
    }

    public void start() {
        boolean looping = true;

        while(looping) {
            System.out.print("? ");
            String userCommand = scan.nextLine();

            switch(userCommand) {
                case "Add":
                    System.out.print("Name: ");
                    String birdName = scan.nextLine();

                    System.out.print("Name in Latin: ");
                    String latinBirdName = scan.nextLine();

                    birdList.addBirdToDatabase(new Bird(birdName, latinBirdName));
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String bird = scan.nextLine();

                    birdList.birdObserved(bird);
                    break;
                case "All":
                    birdList.printAllBirds();
                    break;
                case "One":
                    System.out.print("Bird? ");
                    String birdToPrint = scan.nextLine();

                    birdList.printOneBird(birdToPrint);
                    break;
                case "Quit":
                    looping = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
