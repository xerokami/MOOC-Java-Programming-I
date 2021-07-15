import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a word:");
        String userInput = scan.nextLine();

        String phrase = userInput + userInput + userInput;
        System.out.println(phrase);
    }
}
