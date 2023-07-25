package Stacks;

import java.util.Stack;

public class reverse_Stack {
    public static void pushAtBottome(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottome(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s){
      if(s.isEmpty()){
        return;
      }
        int top=s.pop();
       reverseStack(s);
       pushAtBottome(s, top);
    }
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>() ;
        s.push(1);
        s.push(2);
        s.push(3);
        // printStack(s);
        reverseStack(s);
        printStack(s);

    }
}
