public class TextProviderApp {
    public static void main(String[] args) {

        //anonymous class
        /*print(new TextProvider() {
            @Override
            public String getText() {
                return "Hi";
            }
        });*/

        //Lambda TextProvider
        print(() -> "Hi"); //if no have parameter is necessary parentheses

        //Lambda TextTransform
        print(s -> s.toUpperCase(), "abc"); //if have one parameter no need parentheses
        print(s -> new StringBuilder(s).reverse().toString(), "abc");

        //another way - iterate in 2 - lambda with more than one line
        //Generic way
        TextTransform transform = s -> {
            char[] chars = s.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < chars.length; i += 2) {
                stringBuilder.append(chars[i]);
            }
            return stringBuilder.toString();
        };

        print(transform, "java rocks"); //return "jv ok"

        //another way
        print(s -> {
            char[] chars = s.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < chars.length; i += 2) {
                stringBuilder.append(chars[i]);


            }
            return stringBuilder.toString();
        }, "java rocks"); //same return
    }


    private static void print(TextProvider textProvider) {
        System.out.println(textProvider.getText());
    }

    private static void print(TextTransform textTransform, String text) {
        System.out.println(textTransform.transform(text));
    }
}
