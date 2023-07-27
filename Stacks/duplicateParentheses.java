package Stacks;

import java.util.Stack;

public class duplicateParentheses {
    public static boolean checkdup(String str1){
        Stack<Character> s=new Stack<>();
        for(int  i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;      //duplicate
                }
                else{
                    s.pop();        //opening pair
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="((a+b))";
        String str2="(a-b)";
        System.out.println(checkdup(str1));

    }
}
