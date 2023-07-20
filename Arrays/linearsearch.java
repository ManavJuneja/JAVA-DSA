
package Arrays;

public class linearsearch {
    public static int ls(int num[],int key){
        for(int i=0;i<num.length;i++){
             if(num[i]==key){
                  return i;
             }
        }
        return -1;
    }
   public static void main(String[] args) {
    int num[]={2,3,5,6,7,8};
    int key=3;
  int index= ls(num,key);
  if(index== -1){
    System.out.println("Key Not Found");
  } 
  else{
    System.out.println("Key is at"+index);
  }
   
   }

}
