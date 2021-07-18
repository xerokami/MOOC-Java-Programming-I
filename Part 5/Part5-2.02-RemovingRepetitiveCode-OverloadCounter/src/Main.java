public class Main {
    public static void main(String[] args) {
        Counter myCounter = new Counter();

        myCounter.increase();
        System.out.println(myCounter.value());
        myCounter.increase(100);
        System.out.println(myCounter.value());

        myCounter.decrease(50);
        System.out.println(myCounter.value());
        myCounter.decrease(-100);
        System.out.println(myCounter.value());
        myCounter.decrease();
        System.out.println(myCounter.value());
        myCounter.decrease();
        System.out.println(myCounter.value());
    }
}
