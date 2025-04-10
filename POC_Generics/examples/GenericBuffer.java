public class GenericBuffer {
    public static void main(String[] args) {
        Buffer<String> b1 = new Buffer<>();
        b1.add("A");
        b1.add("B");
        b1.add("C");

        System.out.println(b1.remove().orElse(null));
        System.out.println(b1.remove().orElse(null));
        System.out.println(b1.remove().orElse(null));
        System.out.println(b1.remove().orElse(null));

        Buffer<Boolean> b2 = new Buffer<>();
        b2.add(true);
        b2.add(true);
        b2.add(false);
    }
}

