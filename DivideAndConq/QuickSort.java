package DivideAndConq;

public class QuickSort {
    
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr,si,ei);
        quicksort(arr,si,pIdx-1);//left
        quicksort(arr,pIdx+1, ei);

    }
    public static int partition(int[] arr, int si, int ei) {
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

        
    }
    public static void printarray(int arr[]){
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr);
        }

    }
    public static void main(String[] args) {
        int arr[]={6,4,3,9,2};
        quicksort(arr, 0, arr.length-1);
        printarray(arr);

    }
    
}
