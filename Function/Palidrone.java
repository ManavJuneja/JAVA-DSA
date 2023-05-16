package Function;

import java.util.Scanner;

public class Palidrone {
    public static void reverse(int n){
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
            
        }
    }
    public static void CheckPalidrone(int n){
        if(reverse(n);)
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(CheckPalidrone(n)); 
    }
    
}
