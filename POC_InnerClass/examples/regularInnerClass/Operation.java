package regularInnerClass;

//outer class
public class Operation {
    private final int value1;
    private final int value2;

    public Operation(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int execute(){
        Sum sum = new Sum();
        return sum.calculate();
    }

    //Regular inner class
    private class Sum {
        public int calculate(){
            return value1+value2;
        }
    }

}
