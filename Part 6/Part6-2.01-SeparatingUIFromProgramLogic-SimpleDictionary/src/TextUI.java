import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scan, SimpleDictionary simpleDictionary) {
        this.scan = new Scanner(System.in);
        this.simpleDictionary = new SimpleDictionary();
    }

    public void start() {
        boolean toLoop = true;

        while(toLoop) {
            System.out.println("Command:");
            String userCommand = scan.nextLine();

            switch(userCommand) {
                case "end":
                    System.out.println("Bye bye!");
                    toLoop = false;
                    break;
                case "add":
                    System.out.println("Word");
                    String userWord = scan.nextLine();

                    System.out.println("Translation");
                    String translatedWord = scan.nextLine();

                    simpleDictionary.add(userWord, translatedWord);

                    break;
                case "search":
                    System.out.println("To be translated");
                    String wordToTranslate = scan.nextLine();

                    if (simpleDictionary.translate(wordToTranslate) == null) {
                        System.out.println("Word " + wordToTranslate + " was not found");
                    } else {
                        System.out.println(simpleDictionary.translate(wordToTranslate));
                    }

                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
