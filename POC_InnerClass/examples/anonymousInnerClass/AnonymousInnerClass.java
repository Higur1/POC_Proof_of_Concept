package anonymousInnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        /*class HiMessage implements Message{

            @Override
            public String get() {
                return "Hi";
            }
        }*/
        //HiMessage message = new HiMessage();

        //Anonymous class
        Message message = new Message() {
            @Override
            public String get() {
                return "Hi";
            }
        };
        //Another class anonymous
        Message message2 = new Message() {
            @Override
            public String get() {
                return "Bye";
            }
        };

        System.out.println(message);
    }
}
