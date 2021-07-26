import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> list = new ArrayList<>();

    public ToDoList() {

    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(i+1 + ": " + this.list.get(i));
        }
    }

    public void remove(int number) {
        int removed = number - 1;
        this.list.remove(removed);
    }

}
