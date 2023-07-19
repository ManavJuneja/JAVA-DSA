import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value of firtst integer");
			int a=sc.nextInt();
			System.out.println("Enter the value of Second Interger");
			int b=sc.nextInt();
int Multiply=a*b;
System.out.println(Multiply);
		}
    }
}
