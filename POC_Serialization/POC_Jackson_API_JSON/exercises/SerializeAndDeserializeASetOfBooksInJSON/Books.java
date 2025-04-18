package SerializeAndDeserializeASetOfBooksInJSON;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public class Books {
    private static final String BOOKS_JSON = """
            {
                  "books": [
                    {
                      "isbn": "43243840983",
                      "title": "Java is awesome!",
                      "author": "Zé Programmer",
                      "num_pag": 354
                    },
                    {
                      "isbn": "9986748783",
                      "title": "Learn Java",
                      "author": "Pedro Paulo",
                      "num_pag": 545
                    },
                    {
                      "isbn": "587763767883",
                      "title": "Java For Beginners",
                      "author": "Rodrigo Junqueira",
                      "num_pag": 530
                    }
                  ]
                }
            """;
    private static class ListBooks{
        private  List<Book> books;

        public ListBooks(){}
        public ListBooks(List<Book> books) {
            this.books = books;
        }

        public List<Book> getBooks() {
            return books;
        }

        @Override
        public String toString() {
            return "ListBooks{" +
                    "books=" + books +
                    '}';
        }
    }
    private static class Book{
        private  String isbn;
        private  String title;
        private  String author;

        @JsonProperty("num_pag")
        private  int numPag;

        public Book(){}
        public Book(String isbn, String title, String author, int numPag) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.numPag = numPag;
        }

        public String getIsbn() {
            return isbn;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getNumPag() {
            return numPag;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "isbn='" + isbn + '\'' +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", numPag=" + numPag +
                    '}';
        }
    }
    public static void main(String[] args) throws JsonProcessingException {
        //Serialized
        ListBooks books = JsonUtils.mapper().readValue(BOOKS_JSON, ListBooks.class);
        System.out.println(books);

        //Deserialized
        System.out.println(JsonUtils.mapper().writeValueAsString(books));
    }

}
