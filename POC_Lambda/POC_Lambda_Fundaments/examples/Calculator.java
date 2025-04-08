public class Calculator {
    private int mult;

    int calculate(int x, int y){
        mult = 3; // if the lambda function is using an attribute of the method, this variable can be changed -
        //the restriction of being a final variable is for local variables
        Operation operation = (n1, n2) -> (n1+ n2) * mult;
        mult = 2; // uses the value of the variable at the time of execution of the lambda expression and not the definition
        return operation.calculate(x,y); // mult has value 2 in moment of execution.
    }
}
