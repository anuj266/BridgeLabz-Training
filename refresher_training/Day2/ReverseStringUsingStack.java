import java.util.*;
public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversed = reverseString(input);
        System.out.println(reversed);
        sc.close();
    }

    public static String reverseString(String input){
        Deque<Character> stack=new ArrayDeque<>();
        for(char c:input.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversed=new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}