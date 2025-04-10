public class GenericT {
    public static void main(String[] args) {
        HolderGenerics<String> h1 = new HolderGenerics<>("Hello"); //Set type
        String obj1 = /*(String)*/ h1.getObj(); //no need more cast - protected runtime

        System.out.println(obj1);


        HolderGenerics<Integer> h2 = new HolderGenerics<>(10); //Set type
        int obj2 = /*(Integer)*/ h2.getObj(); //no need more cast - protected runtime

       /* HolderGenerics<Integer> h3 = new HolderGenerics<>(10);
        String obj3 = h3.getObj(); //Protected runtime cast -- warning error
        System.out.println(obj3);*/

        System.out.println(obj2);
    }
}
