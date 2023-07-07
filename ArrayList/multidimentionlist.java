package ArrayList;
import java.util.*;

public class multidimentionlist {
    public static void main(String[] args) {
       ArrayList< ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        mainlist.add(list);
        ArrayList<Integer>list2=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(8);
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>currList=mainlist.get(i);
            {
                for(int j=0;j<currList.size();j++){
                    System.out.println(currList.get(j)+" ");
                }
                System.out.println();
            }
        }

    }
}
