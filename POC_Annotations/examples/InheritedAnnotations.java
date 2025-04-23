public class InheritedAnnotations {
    public static void main(String[] args) {
        Item bookItem = Book.class.getAnnotation(Item.class);
        System.out.println(bookItem);

        /*//By default java does not recognize an annotation in an inherited class
        Item fictionBookItem = FictionBook.class.getAnnotation(Item.class);
        System.out.println(fictionBookItem); //this return is null
        */

        Item fictionBookItem = FictionBook.class.getAnnotation(Item.class);
        System.out.println(fictionBookItem);
    }
}
