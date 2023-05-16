package Arrays;

public class binarySearch {
    public static int bs(int num[],int key){
        int start=0;int end=num.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]>key){
                end=mid-1;
        
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,4,5,6,7,8};
        int key=5;
        System.out.println("Index using BS "+bs(num, key));
    }
}
