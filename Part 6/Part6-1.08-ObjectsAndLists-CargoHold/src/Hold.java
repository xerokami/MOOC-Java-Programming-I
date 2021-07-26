import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.maximumWeight > suitcase.totalWeight()) {
            this.maximumWeight -= suitcase.totalWeight();
            suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;

        for (Suitcase suitcase: suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        String noSuitcases = this.suitcases.size() + " suitcases " + "(" + totalWeight + " kg)";
        String oneSuitcase = this.suitcases.size() + " suitcase " + "(" + totalWeight + " kg)";
        String multipleSuitcases = this.suitcases.size() + " suitcases " + "(" + totalWeight + " kg)";

        switch (this.suitcases.size()) {
            case 0:
                return noSuitcases;
            case 1:
                return oneSuitcase;
            default:
                return multipleSuitcases;
        }
    }
}
