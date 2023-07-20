package Recursion;

public class TillingProblem {
    public static int tillingProblemSolution(int n){ // because 2*n is floor size
           //kaam
           if(n==0|| n==1){
            return 1;
           }
           //vertical choice
           int verticalTiles=tillingProblemSolution(n-1);
           int horizontalTiles=tillingProblemSolution(n-2);
           int totalways=verticalTiles+horizontalTiles;
           return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblemSolution(3));
    }
}
