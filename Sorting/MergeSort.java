package Sorting;

public class MergeSort {
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
     int mid=si+(ei-si)/2;
     mergesort(arr, si, mid);
     mergesort(arr, mid+1, ei);
     merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[i];
                j++;

            }
            k++;
        }
        //for leftover element of 1st sorted part
        while(i<=mid){
            temp[k+1]=arr[i++];
        }
        //for leftover element of 2nd sorted par
        while(j<=ei){
            temp[k+1]=arr[j++];
        }
        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }

    }
  

    public static void printarray(int arr[]){
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,4,2,7,1,8};
        mergesort(arr, 0, arr.length-1);
      printarray(arr);

    }
}
