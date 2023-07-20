package Recursion;

public class print_n_to_one {
    public static void printdec(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n+" ");
        printdec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("Answer is");
        
        printdec(n);
    }
}
