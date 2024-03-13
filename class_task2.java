public class class_task2 {
    String title;
    String author;

    public class_task2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe");
        
    }
}
