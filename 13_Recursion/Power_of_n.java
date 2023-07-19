package Recursion;

public class Power_of_n {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=power(x, n-1);
        // int xn=x*xnm1;
        // return xn;
        return x*power(x, n-1);
    }
    public static int optimizedpower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizedpower(x, n/2);
        int halfpowerSq=halfpower*halfpower;
        //n is odd
        if(n%2!=0){
            halfpowerSq=x*halfpowerSq;
        }
        return halfpowerSq;
    }
     public static void main(String[] args) {
       //System.out.println( power(5,2));
System.out.println(optimizedpower(5, 2));
     }
}
