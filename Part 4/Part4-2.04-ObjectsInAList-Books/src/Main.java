import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Title: ");
            String bookTitle = scan.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int bookPages = Integer.valueOf(scan.nextLine());

            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scan.nextLine());

            books.add(new Book(bookTitle, bookPages, pubYear));
        }

        System.out.println("What information will be printed?");
        String userRequest = scan.nextLine();

        if (userRequest.equals("everything")) {
            for (Book book: books) {
                System.out.println(book);
            }
        } else {
            for (Book book: books) {
                System.out.println(book.getName());
            }
        }
    }
}
