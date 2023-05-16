package Arrays;

public class printMaxSubArraySum {
    public static void maxarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        maxarr(arr);
    }
}
