package OptionalPhoneBookLookup;

public class PhoneBookApplication {
    public static void main(String[] args) {
        var book = new PhoneBook();
        System.out.println(book.findByName("Mria").orElseThrow(IllegalArgumentException::new));

        book.findByName("maria").ifPresentOrElse(
                System.out::println,
                () -> {throw new IllegalArgumentException();} // if you use throw is necessary braces
        );
    }
}
