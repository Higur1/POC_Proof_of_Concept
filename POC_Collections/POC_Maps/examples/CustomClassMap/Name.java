package CustomClassMap;

import java.util.Objects;

public class Name implements Comparable<Name>{
    private final String first;
    private final String last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return first + " " + last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(first, name.first) && Objects.equals(last, name.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    @Override
    public int compareTo(Name o) {
        int aux = first.compareTo(o.getFirst());
        if(aux == 0){
            return last.compareTo(o.getLast());
        }
        return aux;
    }
}
