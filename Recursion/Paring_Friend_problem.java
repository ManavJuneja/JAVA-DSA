package Recursion;

public class Paring_Friend_problem {
    public static int pairit(int n){
        if(n==1||n==2){
            return n;
        }
        // //single
        // int fn1=pairit( n-1);
        // //pair
        // int fn2=pairit(n-2);
        // //pairing ways
        // int pairway=(n-1)*fn2;
        // int totalways=fn1+pairway;
        // return totalways;
        return pairit(n-1)+(n-1)*pairit(n-2);


    }
    public static void main(String[] args) {
    System.out.println(pairit(3));
        
    }
}
