package Arrays;

public class largestNUM {
    public static int getLargest(int num[]){
        int largest=Integer.MIN_VALUE;
             for(int i=0;i<num.length;i++){
                if(largest<num[i]){
                    largest=num[i];
                }
             }
             return largest;
    }
    public static void main(String[] args) {
    int num[]={1,2,3,412,122,25};
    int max=getLargest(num);
    System.out.println("Largest NUmmber is "+ max);

    }
}
