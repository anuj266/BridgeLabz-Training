import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();

            String result = isBalanced(s);

            System.out.println(result);
        }

        sc.close();
    }

    public static String isBalanced(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                if (stack.isEmpty())
                    return "NO";

                char top = stack.pop();

                if (c == ')' && top != '(' ||
                    c == ']' && top != '[' ||
                    c == '}' && top != '{') {
                    return "NO";
                }
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }

        return "NO";
    }
}