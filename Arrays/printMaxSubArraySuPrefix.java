package Arrays;
//prefix[end]-prefix[start -1] 
// TC O(n^2)
public class printMaxSubArraySuPrefix { public static void maxarr(int arr[]){
    int maxSum=Integer.MIN_VALUE;
    int prefix[]=new int [arr.length];
    //calculate prefix array
    prefix[0]=arr[0];
    for(int i=1;i<prefix.length;i++){
prefix[i]=prefix[i-1]+prefix[i];
    }
    for(int i=0;i<arr.length;i++){
        int start=i;
        for(int j=i;j<arr.length;j++){
            int end=j;
            int currsum= start ==0? prefix[end]: prefix[end]-prefix[start-1];
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
