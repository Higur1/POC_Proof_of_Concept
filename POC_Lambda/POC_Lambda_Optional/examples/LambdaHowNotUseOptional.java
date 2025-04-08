import java.util.Optional;

public class LambdaHowNotUseOptional {

    //Do not use optional in class attribute
    private Optional<String> id;

    //Do not use optional as a parameter for method
    public void sum(Optional<Integer> v1, Optional<Integer>v2){}

    public Optional<Integer> getNumber(){
        //never use null in Optional
        //Optional<String> s = null;

        //right way
        Optional<String> s = Optional.empty();

        //Optional should not return null;
        return Optional.empty();
    }
}
