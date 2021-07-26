import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return this.list;
    }

    public String take() {
        int last = this.list.size() - 1;
        String taken = this.list.get(last);
        this.list.remove(last);
        return taken;
    }
}
