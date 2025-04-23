import java.time.LocalDate;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book(10, "abc", LocalDate.now());
        int id = book.getId();
    }
}
