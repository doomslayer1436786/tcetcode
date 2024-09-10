import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question4 {
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(4,77,62,54,21,88,212,453,211,87);
    List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());                            
        System.out.println("even number are: " + evenNumbers);
    }
}

