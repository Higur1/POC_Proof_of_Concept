public class DimensionsArray {
    public static void main(String[] args) {
        int[] oneDimension = new int [5];
        int[][] twoDimensions = new int [3][2];
        int[][][] threeDimensions = new int [3][3][3];

        //another way to start array multi dimensions
        int[][] initArrayTwoDimensions = {
                {2,5},
                {3,7},
                {8,9}
        };

        /* Visual example
           [][]
           [][]
           [][]
        */

        for(int i = 0; i < initArrayTwoDimensions.length; i++){
            for(int j = 0; j < initArrayTwoDimensions[i].length; j++){
                System.out.print(initArrayTwoDimensions[i][j] + " ");
            }
            System.out.println();
        }
    }
}
