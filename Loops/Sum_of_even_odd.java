package Loops;

import java.util.Scanner;

public class Sum_of_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        int choice;
        do{
            System.out.println("Enter the Number");
            int num = sc.nextInt();
            if(num%2==0){
                evenSum=+num;
            }
            else{
                oddSum=+num;
            }

        System.out.println("Enter your choice");
         choice=sc.nextInt();

        }
    while(choice==1);
    System.out.println("Sum even Number"+evenSum);
    System.out.println("Sum of odd Number"+oddSum);

    }
}
