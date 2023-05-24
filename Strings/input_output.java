package Strings;

import java.util.Scanner;

public class input_output {
    public static void printletter(String str){

        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        String firstName="manav";
        String lastName="juneja";
        //concatenation wil be done here

        String fullName=firstName + " "+lastName;
        System.out.println(fullName);
       // System.out.println(name.charAt(0));
printletter(fullName);
    }
}
