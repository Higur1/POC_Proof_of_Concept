package Generic3x3MatrixImplementation;

public class RunMatrix {
    public static void main(String[] args) {
        CreateMatrix<Integer> n1 = new CreateMatrix<>();
        n1.set(0,0,1);
        n1.set(1,1,5);
        n1.print();
    }
}
