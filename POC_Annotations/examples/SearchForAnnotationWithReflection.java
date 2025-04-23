import java.util.stream.Stream;

public class SearchForAnnotationWithReflection {
    public static void main(String[] args) throws NoSuchFieldException {
        Stream.of(Book.class.getAnnotations()).forEach(System.out::println); //work only with @RetentionPolicy.RUNTIME

        Stream.of(Book.class.getDeclaredField("title").getAnnotations()).forEach(System.out::println);

        MaxLength maxLength = Book.class.getDeclaredField("title").getAnnotation(MaxLength.class);
        System.out.println(
                maxLength.value()
        );


        Item bookItem = Book.class.getAnnotation(Item.class);

    }
}
