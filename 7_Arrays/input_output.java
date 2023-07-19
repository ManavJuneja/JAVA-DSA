package Arrays;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        //input
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        }
        //output5
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
