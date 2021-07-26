public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return amount;
    }

    public void add(int amountToAdd) {
        if (amountToAdd < 0) {
            return;
        } else if (this.contains() + amountToAdd <= 100) {
            amount += amountToAdd;
        } else{
            amount = 100;
        }
    }

    public void remove(int amountToRemove) {
        if (amountToRemove < 0) {
            return;
        }
        if (this.contains() - amountToRemove < 0) {
            amount = 0;
        } else {
            amount += -amountToRemove;
        }
    }

    @Override
    public String toString(){
        return this.contains() +"/100";
    }

}