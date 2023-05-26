package BitManipulation;



public class Bit_Operation {
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
        
    }
    public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
       
    }
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int updateithbit(int n,int i,int newbit){
        // if(newbit==0){
        //     return clearithbit(n, i);
        // }
        // else{
        //     return setithbit(n, i);
        // }
        n=clearithbit(n, i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    public static int clearlastithbit(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static int clearanngebit(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return  n&bitMask; 
    }
     public static void main(String[] args) {
        System.out.println(getithbit(10, 2));
       System.out.println(setithbit(10, 2)); 
       System.out.println(clearithbit(10, 1));
   System.out.println(updateithbit(10, 2,1 ));
   System.out.println(clearlastithbit(15, 2));
   System.out.println( clearanngebit(10, 2, 4) ); 
}
}
