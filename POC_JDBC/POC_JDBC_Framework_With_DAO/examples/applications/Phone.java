package applications;

public record Phone(Integer id, Integer customerId, String description, String number) {
    public Phone(Integer customerId, String description, String number){
        this(null, customerId, description, number);
    }
}
