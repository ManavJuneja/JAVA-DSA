package Arrays;



public class pairInArray {
    public static void printPairs(int[] num){
        int TotalPairs=0;
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("( "+curr+" ,"+num[j]+")");
                TotalPairs++;
            }
            System.out.println();
            System.out.println("Total Pairs "+ TotalPairs );
        }
        //TC= O(n^2)
    }
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7};
       printPairs(num);
       

    }
}
