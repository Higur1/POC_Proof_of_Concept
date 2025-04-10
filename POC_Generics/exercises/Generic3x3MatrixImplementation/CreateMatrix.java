package Generic3x3MatrixImplementation;

import java.util.ArrayList;
import java.util.List;

public class CreateMatrix<T> {
    private static final int SIZE = 3;
    //private T[] elements = new T[SIZE]; //not compile
    private List<List<T>> elements = new ArrayList<>();

    public CreateMatrix() {
        /*
            null null null
            null null null
            null null null
        */
        for (int i = 0; i < SIZE; i++) {
            List<T> row = new ArrayList<>();
            for (int j = 0; j < SIZE; j++) {
                row.add(null);
            }
            elements.add(row);
        }
    }

    public void print() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(elements.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void set(int row, int col, T element) {
        elements.get(row).set(col, element);
    }
}
