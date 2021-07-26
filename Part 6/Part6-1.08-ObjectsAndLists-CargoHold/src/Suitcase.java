import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (this.maximumWeight > item.getWeight()) {
            this.maximumWeight -= item.getWeight();
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item: items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        Item heaviestItem = items.get(0);
        for (Item item: items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        int totalWeight = 0;

        for (Item item: items) {
            totalWeight += item.getWeight();
        }

        String noItems = this.items.size() + " items " + "(" + totalWeight + " kg)";
        String singleItem = this.items.size() + " item " + "(" + totalWeight + " kg)";
        String multipleItems = this.items.size() + " items " + "(" + totalWeight + " kg)";
        switch (this.items.size()) {
            case 0:
                return noItems;
            case 1:
                return singleItem;
            default:
                return multipleItems;
        }
    }
}
