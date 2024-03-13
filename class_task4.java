public class class_task4 {
    String title;
    String author;
    int yearOfPublication;

    public class_task4(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year of Publication: " + yearOfPublication;
    }

    public static void main(String[] args) {
        class_task4 book1 = new class_task4("Book1", "Author1", 2000);
        class_task4 book2 = new class_task4("Book2", "Author2", 2005);
        System.out.println(book1);
        System.out.println(book2);
    }
}
