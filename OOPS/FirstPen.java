package OOPS;

public class FirstPen {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("Blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        
        
    }
    
}
class Pen{
    String color;
    int tip;
    void setcolor(String newColor){
        color=newColor;

    }
    void setTip(int newTip){
        tip=newTip;
    }
}
