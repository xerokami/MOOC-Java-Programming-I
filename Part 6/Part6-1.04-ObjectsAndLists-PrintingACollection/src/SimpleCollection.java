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

    //creating the toString method
    @Override
    public String toString() {
        int elementNum = this.elements.size();

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else if (elementNum == 1) {
            String elementList = elements.get(0);
            return "The collection " + this.name + " has " + elementNum + " element:" + "\n" + elementList;
        } else {
            String elementList = "";
            for (String element: elements) {
                elementList += element + "\n";
            }
            return "The collection " + this.name + " has " + elementNum + " elements:" + "\n" + elementList;
        }
    }

}
