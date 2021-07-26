import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        //Testing part1
        int[] numbersPart1 = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbersPart1));
        System.out.println("");

        //Testing part2
        // indices:      0  1  2  3  4
        int[] numbersPart2 = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbersPart2));
        System.out.println("");

        //Testing part3
        // indices:       0  1  2  3   4
        int[] numbersPart3 = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbersPart3, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbersPart3, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbersPart3, 2));
        System.out.println("");

        //Testing part4
        int[] numbers = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        System.out.println("");

        //Testing part5
        int[] numbersPart5 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbersPart5);
        System.out.println(Arrays.toString(numbersPart5));
        System.out.println("");
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int integer: array) {
            if (integer < smallest) {
                smallest = integer;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int [] array) {
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                    smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swapped = array[index1];

        array[index1] = array[index2];
        array[index2] = swapped;
    }

    //Selection sort concept:
    //Move the smallest number in the array to index 0.
    //Move the second smallest number to index 1.
    //Move the third smallest number in the array to index 2.
    //etc.
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
