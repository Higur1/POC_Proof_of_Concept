package CountCharacterOccurrencesInAString;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {
        System.out.println(count("JavA"));
        System.out.println(count("Object oriented"));
        System.out.println(count("package"));
        System.out.println(count("override"));
    }

    private static Map<Character, Long> count(String str) {
        var r =
                Optional
                        .ofNullable(str)
                        //.map(s -> s.toUpperCase());
                        .map(String::toUpperCase)
                        .stream()
                        //.map(s -> s.chars());
                        //.map(String::chars);
                        //.flatMap(s -> s.chars()) // not possible because return intStream
                        //.flatMapToInt(s -> s.chars());
                        .flatMapToInt(String::chars) //IntStream
                        .filter(c -> !Character.isWhitespace(c)) //remove count of white spaces
                        .mapToObj(i -> (char) i) //Stream<Character>
                        .collect(Collectors.groupingBy(
                                /*c-> c*/ Function.identity(),
                                Collectors.counting()
                        ));
        System.out.println(r);
        return null;
    }
}
