package Recursion;

public class sum_of_n {
    public static int calsum(int n){
        if(n==1){
            return 1;
        }
        int sum1=calsum(n-1);
            int sum2=n+sum1;
        return sum2;
        }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println("Sum is");
        System.out.println(calsum(n));

    }
}
