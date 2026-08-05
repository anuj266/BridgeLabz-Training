import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueueUsingTwoStacks {
    static class MyQueue<T>{
        Deque<T> inputStack=new ArrayDeque<>();
        Deque<T> outputStack=new ArrayDeque<>();
        void enqueue(T val){
            inputStack.push(val);
        }
        T dequeue(){
            if(outputStack.isEmpty()){
                while(!inputStack.isEmpty()){
                    outputStack.push(inputStack.pop());
                }
            }
            return outputStack.pop();
        }
        T peek(){
            if(outputStack.isEmpty()){
                while(!inputStack.isEmpty()){
                    outputStack.push(inputStack.pop());
                }
            }
            return outputStack.peek();
        }
        
    }
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
