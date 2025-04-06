public class InterationArray {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,7,11,13,17,19};

        for(int i = 0; i< numbers.length; i++){
            System.out.format("=> %s\n", numbers[i]);
        }

        //Enhanced for
        for(int n: numbers){
            System.out.format("=> %s\n", numbers[n]);
        }
    }
}
