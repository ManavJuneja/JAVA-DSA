package Loops;

import java.util.Scanner;

public class Rev_NUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
}
