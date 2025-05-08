package applications;

public record Customer(Integer id, String name, String email, Integer age) {
    public Customer(String name, String email, Integer age){
        this(null, name, email, age);
    }
}
