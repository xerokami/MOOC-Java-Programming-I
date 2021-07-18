public class Main {
    public static void main(String[] args) {
        Person joan = new Person("Joan Ball");
        System.out.println(joan);

        joan = null;
        joan.growOlder();
    }
}
