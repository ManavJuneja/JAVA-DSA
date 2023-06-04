package Recursion;

public class BinaryString {
    public static void printit(int n,int lastplace, String str ){
       if(n==0){
        System.out.println(str);
        return;
       }
        printit(n-1, 0, str+"0");
        if(lastplace==0){
            printit(n-1, 0, str+"1");
        }
    }
    public static void main(String[] args) {
        printit(3, 0,"");
        
    }
}
 