import java.util.List;
import java.util.function.Supplier;

public class MethodReferences {

    private static void print(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring boot","API","Microservices","AWS","Azure","Docker");

        courses.stream()
               // .map(str -> str.toUpperCase())
                .map(String::toUpperCase)
                .forEach(MethodReferences::print);

        Supplier <String> supplier = String::new;

    }



}
