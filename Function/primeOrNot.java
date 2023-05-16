package Function;

public class primeOrNot {
    // public static boolean prime(int n){
    //    boolean isprime=true;
    //     for(int i=2;i<=n-1;i++){
    //     if(n%i==0){
    //         isprime= false;
    //     }
    //    }
    // return isprime;   
    // }
    //OPTIMEIZED APPROACH
    public static boolean prime(int n){
           boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime= false;
            }
           }
        return isprime;
        }
    public static void main(String[] args) {
        int n=2;
        System.out.println(prime(n));
    }
}
