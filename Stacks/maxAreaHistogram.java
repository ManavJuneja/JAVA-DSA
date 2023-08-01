package Stacks;

import java.util.Stack;

public class maxAreaHistogram {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]= new int[arr.length];
        int nsl[]= new int[arr.length];

        //Next Smaller Right   TC=O(n)
        Stack<Integer> s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){

            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsr[i]=arr.length;
            }
            else{
                //top
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //Next Smaller Left    TC=O(n)
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsl[i]=-1;
            }
            else{
                //top
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //Current Area width = j-i-1 =nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea, currArea);
        }
        System.out.println("Maximum area in histogram is "+maxArea);

    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3}; //height in histogram
        maxArea(arr);
    }
}
