import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,10,8,15,17,9,3,5);

        // On recup les nombres paires et on calcule leurs carrés
        numbers.stream()
                .filter(x->x%2==0)
                .map(x->x*x)
                .forEach(System.out::println);
    }
}
