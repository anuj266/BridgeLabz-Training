public class MethodOverloading {

    static class Calculator {
        int add(int a, int b) { 
            return a + b; 
        }
        
        double add(double a, double b) { 
            return a + b; 
        }
        
        int add(int a, int b, int c) { 
            return a + b + c; 
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling all three methods and printing results
        System.out.println("Adding two ints (5 + 10): " + calc.add(5, 10));
        System.out.println("Adding two doubles (5.5 + 2.5): " + calc.add(5.5, 2.5));
        System.out.println("Adding three ints (1 + 2 + 3): " + calc.add(1, 2, 3));
        
    }
}