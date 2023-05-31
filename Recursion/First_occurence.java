package Recursion;

public class First_occurence {
    public static int isOccured(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return isOccured(arr, key, i+1);
       
    }
    public static void main(String[] args) {
        int arr[]={3,16,1,26,6};
        int key=26;
       System.out.println( isOccured(arr, key, 0));

    }
}
