import java.util.ArrayList;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(3);
        numList.add(5);
        numList.add(7);
        numList.add(0);

        int total = numList.get(1) + numList.get(5);
        System.out.println(total);
    }
}

