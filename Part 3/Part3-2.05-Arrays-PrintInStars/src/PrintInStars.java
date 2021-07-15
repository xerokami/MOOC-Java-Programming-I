public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        String stars = "";
        for (int number: array) {
            for (int i = 1; i <= number; i++) {
                stars += "*";
            }
            System.out.println(stars);
            stars = "";
        }
    }
}
