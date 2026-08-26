import java.util.Arrays;
import java.util.List;

//NumericBox class with a Bounded Type Parameter
class NumericBox<T extends Number> {
    private T item;

    public NumericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class BoundedAndWildcardImpl {
    
    //sumOfList method using an Upper Bounded Wildcard
    static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test on a List<Integer>
        List<Integer> intList = Arrays.asList(10, 20, 30);
        System.out.println("Sum of Integer List: " + sumOfList(intList));

        // Test on a List<Double>
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Sum of Double List: " + sumOfList(doubleList));
        
        // compilation error:
        // NumericBox<String> stringBox = new NumericBox<>("Hello"); 
        // NumericBox<String> fails to compile because the String class
        // does not extend the Number class, violating the <T Number extends> upper-bound 
        // constraint placed on the generic type parameter.
    }
}