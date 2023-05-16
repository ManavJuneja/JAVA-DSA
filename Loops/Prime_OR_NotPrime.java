package Loops;

import java.util.Scanner;

public class Prime_OR_NotPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;

       // for(int i=2;i<n-1;i++){
        for(int i=2;i<=Math.sqrt(n);i++){ 
        if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("N is prime");

        }
        else{
            System.out.println("N is Not Prime");
        }
    }
}
