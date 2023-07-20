package Function;

public class prime_in_range {
    public static boolean prime(int n){
        boolean isprime=true;
         for(int i=2;i<=Math.sqrt(n);i++){
         if(n%i==0){
             isprime= false;
         }
        }
     return isprime;
     }
     public static void primeinrange(int n){
      for(int i=2;i<=n;i++){
       if( prime(i)){
        System.out.println(i + " ");
       }
      }
     }
     public static void main(String[] args) {
        primeinrange(20);
     }
}
