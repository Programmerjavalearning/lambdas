import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BehaviorParameter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,10,8,15,17,9,3,5);

   //     filterAndPrint(numbers, x -> x % 2 == 0);

    //    filterAndPrint(numbers, x -> x % 2 != 0);



        List squareNumber = createListOfNumbers(numbers, x -> x * x);
        List cubeNumber = createListOfNumbers(numbers, x -> x * x * x) ;

        // No input return something
        Supplier<Integer> randomInteger = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        System.out.println(randomInteger.get());

       // System.out.println(squareNumber);
      //  System.out.println(cubeNumber);


    }

    private static List createListOfNumbers(List<Integer> numbers, Function<Integer, Integer> calculeFunctionForList) {
        List squareNumber = numbers.stream()
                .map(calculeFunctionForList).collect(Collectors.toList());
        return squareNumber;
    }

    // On passe un predicate en parametre d'une methode
    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> integerPredicate) {
        numbers.stream()
                .filter(integerPredicate)
                .forEach(System.out::println);
    }

}
