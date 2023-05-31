package Recursion;

public class Last_occurence {
    public static int lastocc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastocc(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,7,3};
        int key=5;
        System.out.println(lastocc(arr, key,0 ));
    }
}
