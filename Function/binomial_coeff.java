package Function;

public class binomial_coeff {
    public static int fact(int n){
        int f=1;
       
        for(int i=1 ;i<=n;i++){
         f=   f*i;
        }
        return f;
    }
    public static int bc(int n,int r){
        int fn=fact(n);
        int fr=fact(r);
        int fnr=fact(n-r);
        int ans=fn/(fr*fnr);
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println(bc(n, r));

    }
}
