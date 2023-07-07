package ArrayList;

import java.util.ArrayList;

public class swapnum {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp) ;
        System.out.println(list);
    }
    public static void main(String[] args) {
          ArrayList<Integer>list=new ArrayList<>();
    list.add(5);
     list.add(3);
      list.add(7);
       list.add(9);
        list.add(4);
         list.add(1);
         int idx1=1;
         int idx2=3;
         swap(list,idx1, idx2);
    }
}
