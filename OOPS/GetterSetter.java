package OOPS;

public class GetterSetter {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.setName("BMW");
        c1.setColor("Black");
        System.out.println(c1.getName());
        System.out.println(c1.getColor());
        
        
        
    }
}
class Car{
   private String color;
   private String name;
    String getColor(){
        return this.color;
    }
    String getName(){
        return this.name;
    }
    void setColor(String newColor){
        this.color=newColor;

    }
    void setName(String newName){
        this.name=newName;
    }
}
