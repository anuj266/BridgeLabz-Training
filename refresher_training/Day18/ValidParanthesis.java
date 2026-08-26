import java.util.*;
public class ValidParanthesis{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            isBalanced(input);
		}
		
	}
    
    static void isBalanced(String input){
        Deque<Character> stack = new ArrayDeque<>();
        for(char c:input.toCharArray()){
            if("({[".indexOf(c)!=-1){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    System.out.println(false);
                    return;
                }
                char top=stack.peek();
                if((top=='(' && c==')')||(top=='{' && c=='}')||(top=='[' && c==']')){
                    stack.pop();
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}



