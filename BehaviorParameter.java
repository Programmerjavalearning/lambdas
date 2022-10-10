import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,10,8,15,17,9,3,5);

        filterAndPrint(numbers, x -> x % 2 == 0);

        filterAndPrint(numbers, x -> x % 2 != 0);


    }

    // On passe un predicate en parametre d'une methode
    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> integerPredicate) {
        numbers.stream()
                .filter(integerPredicate)
                .forEach(System.out::println);
    }

}
