import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

//Serializable is a tagging interface - every hierarchy must be serializable - int, String, LocalDate is serializable
public class Client implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L; // Manually setting the serial version -- Helps with deserialization in case of method and attribute changes
    private final int id;
    private final String name;
    private final LocalDate birthDate;

    //Serialize ignore this attribute
    private transient final String document;

    public Client(int id, String name, LocalDate birthDate) {
        this(id, name, birthDate, null);
    }
    public Client(int id, String name, LocalDate birthDate, String document) {
        System.out.println("[Constructor]");
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.document = document;
    }

    //is necessary get to serialized
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getDocument() {
        return document;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name) && Objects.equals(birthDate, client.birthDate) && Objects.equals(document, client.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, document);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", document='" + document + '\'' +
                '}';
    }
}
