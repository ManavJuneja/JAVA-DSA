package Function;

public class call_by_value {
    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        swap(a,b);
    }
}
