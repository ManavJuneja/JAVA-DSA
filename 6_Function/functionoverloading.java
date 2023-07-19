package Function;

public class functionoverloading {
    public static int sum(int a,int b,int c){
        int ans=a+b+c;
        return ans;
    }
    public static int sum(int a,int b){
        int ans=a+b;
        return ans;
    }
    public static void main(String[] args) {
        int a=10;
        int b=3;int c=4; 
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
    }
}
