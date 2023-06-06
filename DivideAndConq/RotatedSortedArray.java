package DivideAndConq;

public class RotatedSortedArray {
    public static int search(int arr[],int si,int ei,int target){
       if(si>ei){
        return -1;
       }
        //kaam
        int mid=si+(ei-si)/2;
        //case found
        if(arr[mid]==target){
            return mid;
        }
        // mid on L1
        if(arr[si]<=arr[mid]){
            //case a:left
            if(arr[si]<=target&&target<=arr[mid]){
                return search(arr, si, mid-1, target);
            }
            else{
                return search(arr, mid+1, ei, target);
            }
        }
        //case b: L2
        else{
            if(arr[mid]<=target&&target<=arr[ei]){
               return search(arr, mid+1, ei, target);
            }
            else{
                return search(arr, si, mid-1, target);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int ans=search(arr,0,arr.length,5);
        System.out.println(ans);
        
    }
}
