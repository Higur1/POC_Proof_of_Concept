import java.lang.annotation.Documented;
import java.time.LocalDate;

@Item
public class Book {
    @Id
    private final int id;

    @MaxLength(80)
    private final String title;
    private final LocalDate releaseDate;

    public Book(int id, String title, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
    }



    @Role("admin")
    @Role("guest") //it is only possible to use two identical annotations after creating the container for storing annotations - in this case Annotation "Roles"
    @Id
    public int getId() {
        return id;
    }
    //@MaxLength(value = 80) // if is the only attribute it can be omitted - special feature of value
    @MaxLength(80)
    public String getTitle() {
        return title;
    }
    @Date(format = "dd/MM/yyyy") //default enabled: true
    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
