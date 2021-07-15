public class Book {
    private String name;
    private int pages;
    private int pubYear;

    public Book(String bookName, int bookPages, int publicationYear) {
        this.name = bookName;
        this.pages = bookPages;
        this.pubYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPubYear() {
        return this.pubYear;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.pubYear;
    }
}
