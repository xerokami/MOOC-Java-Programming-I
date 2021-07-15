public class Statistics {
    private int count;
    private int sum;
    private int sumOfEven;
    private int sumOfOdd;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        this.sumOfEven = 0;
        this.sumOfOdd = 0;
    }

    public void addNumber(int number) {
        if (number % 2 == 0) {
            this.sumOfEven += number;
        } else {
            this.sumOfOdd += number;
        }
        this.sum += number;
        this.count++;
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public int sumOfEven() {
        return this.sumOfEven;
    }

    public int sumOfOdd() {
        return this.sumOfOdd;
    }

    public double average() {
        double average = 1.0 * this.sum / this.count;
        return average;
    }
}