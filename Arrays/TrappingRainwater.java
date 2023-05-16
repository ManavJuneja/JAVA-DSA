package Arrays;
//This Question also have different name like highest jump
// Highest histogram etc but logic is same
public class TrappingRainwater {
    public static int TrapRainW(int height[]){
        int n=height.length;
        //calculate left max boundary - array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // calculate rigth max boundary - array
        int rigthMax[]=new int [n];
        rigthMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i++){
            rigthMax[i]=Math.max(height[i], rigthMax[i+1]);
        }
        int trappedWater=0;
        //loop 
        for(int i=0;i<n;i++){
            // water level=min(leftmax bound , rigthmax bound)
            int waterLevel=Math.min(leftMax[i], rigthMax[i]);
        //trapped water =waterlevel -heigth[i]
        trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
       
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrapRainW(height));

    }

}
