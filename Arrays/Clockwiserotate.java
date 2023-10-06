package Arrays;

public class Clockwiserotate {
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            rotateArrayByOne(arr);
            
            System.out.println("Rotated array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        
        public static void rotateArrayByOne(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return; // No rotation needed
            }
            
            int temp = arr[arr.length - 1]; // Store the last element
            
            // Shift elements to the right by one position
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            
            arr[0] = temp; // Place the stored element at the beginning
        }
    }
    
    

