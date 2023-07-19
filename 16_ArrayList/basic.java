package ArrayList;
import java.util.ArrayList;
public class basic {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
             list.add(1);
             list.add(2);
             list.add(3);
             System.out.println(list);
             //get operation
             int element=list.get(2);
             System.out.println(element);

            //remove element
            list.remove(1);
            System.out.println(list);

            //set element
            list.set(1, 100);
            System.out.println(list);
            
            //contain element
          System.out.println(list.contains(1));  
           System.out.println(list.contains(55)); 

           //add element add baaki element piche shift ho jaee ge
           list.add(0, 65);
           System.out.println(list);

           //size of list
           System.out.println(list.size());

           //print array list with loop
           for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
           }
           System.out.println();
           //revese array list
           for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
           }
           System.out.println();
    }
}
