package Arrays;



public class reverseAnArray {
    public static void REV(int num[]){
        int first=0; int last=num.length-1;
        while(first<last){
            int temp=num[first];
           num[first]=num[last];
           num[last]=temp;
            first++;
            last--;
        }
    
        
    }
    public static void main(String[] args) {
         //sc= O(1)
         //TC= O(n/2)
         int num[]={1,2,3,412,122};
         REV(num);
         for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
         }
}
}