import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Where to?");
        int userEnd = Integer.valueOf(scan.nextLine());

        System.out.println("Where from?");
        int userStart = Integer.valueOf(scan.nextLine());

        for (int i = userStart; i <= userEnd; i++) {
            System.out.println(i);
        }
    }
}