public class ArrayWithDifferentSizes {
    public static void main(String[] args) {
        int [][] numbers = new int [4][];

        numbers[0] = new int[3];
        numbers[1] = new int[2];
        numbers[2] = new int[7];
        numbers[3] = new int[8];

        /* Visual example
            [][][]
            [][]
            [][][][][][][]
            [][][][][][][][]
        */

        for(int[] firstLine: numbers){
            for(int secondLine: firstLine){
                System.out.print(secondLine+ " ");
            }
            System.out.println();
        }
    }
}
