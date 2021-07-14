import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        wordList.add("Jack");
        wordList.add("Mary");
        wordList.add("Alex");
        wordList.add("Jill");

        System.out.println("Search for?");
        String nameSearch = scan.nextLine();

        if (wordList.contains(nameSearch)) {
            System.out.println(nameSearch + " was found!");
        } else {
            System.out.println(nameSearch + " was not found!");
        }
    }
}