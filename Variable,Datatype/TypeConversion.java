public class TypeConversion {
    public static void main(String[] args) {
        int a=10;
        float b=20.23f;
        long c=30;
        double d=30;
        double ans=a+b+c+d;
        System.out.println(ans);
        //error occur when convert to ans to in because of doing lossly convertion
    }
}
