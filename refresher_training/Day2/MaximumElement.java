import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> operations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            operations.add(sc.nextLine());
        }
        List<Integer> result = getMax(operations);
        for (int value : result) {
            System.out.println(value);
        }
        sc.close();
    }

    public static List<Integer> getMax(List<String> operations) {

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> max = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for (String s : operations) {
            String[] operation = s.split(" ");
            int op = Integer.parseInt(operation[0]);
            if (op == 1) {
                int val = Integer.parseInt(operation[1]);
                stack.push(val);
                if (max.isEmpty() || max.peek() < val) {
                    max.push(val);
                } else {
                    max.push(max.peek());
                }
            } else if (op == 2) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    max.pop();
                } else {
                    throw new RuntimeException("Stack Underflow");
                }
            } else {
                result.add(max.peek());
            }
        }

        return result;
    }
}