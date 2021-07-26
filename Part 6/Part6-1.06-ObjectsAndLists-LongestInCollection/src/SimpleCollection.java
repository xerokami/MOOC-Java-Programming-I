import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    //method to return the longest string in the elements list
    public String longest() {

        if (elements.isEmpty()) {
            return null;
        } else {
            String longest = elements.get(0);
            for (String element: elements) {
                if (element.length() > longest.length()) {
                    longest = element;
                }
            }
            return longest;
        }
    }
}
