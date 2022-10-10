import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BehaviorParameter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,10,8,15,17,9,3,5);

        BiPredicate<Integer,String> biPredicate = (number,string) -> {
            return number < 10 && string.length()> 5;
        };

        System.out.println(biPredicate.test(11,"testtaille"));


        BiFunction <Integer, String, String> biFunction = (number, string) -> {
            return number + " " + string;
        };

        System.out.println(biFunction.apply(11,"testtaille"));


        BiConsumer<String, String> biConsumer = ( s1, s2) -> {
            System.out.println(s1 + s2);
        };

        biConsumer.accept("toto", "titi");


    }



}
