public class PrintNeatly {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        String neatly = "";
        for (int i = 0; i < array.length; i++) {
            if (!(i == array.length - 1)) {
                neatly += array[i] + ", ";
            } else {
                neatly += array[i];
            }
        }
        System.out.println(neatly);
    }
}