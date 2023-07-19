
package TwoDArray;

public class DiagonalSum {
   private static int sum;
    //BruteForce
    public static int DiSu(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for (int j = 0; j < matrix.length; j++) {
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }

                
            }
        }
        return sum;
        
    }
    //Optimised
    public static int Disuopti(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            int sum=0;
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
            
        }
        return sum;

    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};
            System.out.println(DiSu(matrix));
            System.out.println(Disuopti(matrix));
    }
}

