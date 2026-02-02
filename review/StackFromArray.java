package review;
class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackArray(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            return;
        }
        arr[++top] = x;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    public void printStack() {
    	if(isEmpty()) {
    		System.out.println("Stack is empty");
    		return;
    	}
    	for(int i=top;i>=0;i--) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class StackFromArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();
        System.out.println(stack.peek());
        System.out.println(stack.pop());  
        stack.printStack(); 
    }
}
