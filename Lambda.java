import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,10,8,15,17,9,3,5);
        List<Integer> numbers2 = List.of(12,10,8,15,17,9,3,6);

        //Extraction des expression lambda en variable locale

        //Attends un boolean en retour
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        // Correspond à :
        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }
        };


        Function<Integer, Integer> squareFunction = x -> x * x;
        //Correspond à :
        Function<Integer,Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };


        Consumer<Integer> sysoutConsumer = System.out::println;
        // correspond à :
        Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                System.out.println(x);

            }
        };

        // On recup les nombres paires et on calcule leurs carrés
        numbers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(sysoutConsumer);


        BinaryOperator<Integer> sumBynaryOperator = Integer::sum;
        // BinaryOperator<Integer> sumBynaryOperator3 = (a,b) -> a+b;

        BinaryOperator<Integer> sumBynary2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
        int sum = numbers2.stream()
                .reduce(0, sumBynaryOperator);

        System.out.println("Somme totale = " + sum);





    }






}
