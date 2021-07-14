import java.util.ArrayList;

public class ThirdElement {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("First");
        wordList.add("Second");
        wordList.add("Third");
        wordList.add("Fourth");

        System.out.println(wordList.get(2));
    }
}
