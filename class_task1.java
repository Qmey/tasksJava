public class class_task1 {
    String bookName;
    String authorName;
    int shelfNumber;

    public class_task1(String bookName, String authorName, int shelfNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.shelfNumber = shelfNumber;
    }

    public static void main(String[] args) {
        Library book1 = new Library("Book1", "Author1", 1);
        Library book2 = new Library("Book2", "Author2", 2);
    }
}
