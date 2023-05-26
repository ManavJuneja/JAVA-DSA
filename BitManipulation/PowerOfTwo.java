package BitManipulation;

public class PowerOfTwo {
    public static boolean ispoweroftwo(int n){{
        return(n&(n-1))==0;
    }}
    public static void main(String[] args) {
     System.out.println(ispoweroftwo(15));   
    }
}
