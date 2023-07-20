package Arrays;
//Brute Forces because TC is O(n^3)
public class printMaxSubArraySum {
    public static void maxarr(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int currsum=0;
                for(int k=start;k<=end;k++){
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
        }
        System.out.println("max Sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        maxarr(arr);
    }
}
