public class IncrementArray {
    public static void main(String[] args) {
        int y = 10; //Stack information
        int[] x = {10}; //Heap reference

        incrementArray(x);
        increment(y);

        System.out.println(x[0]); // returns 11
        System.out.println(y); // returns 10
    }
    public static  void incrementArray(int [] array){
        //reference a array position in Heap
        array[0]++;
    }
    public static void increment(int y){
        //copy of y in Stack
        y++;
    }
}
