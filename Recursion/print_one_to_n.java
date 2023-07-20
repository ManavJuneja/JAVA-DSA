package Recursion;

public class print_one_to_n {
    public static void printn(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printn(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        printn(n);
    }
}
