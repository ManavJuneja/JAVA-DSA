import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Side");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println(area);

    }
}
