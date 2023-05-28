package OOPS;

public class AbstractClass {
    public static void main(String[] args) {
        horse h=new horse();
        h.eat();
        h.walk();
        chicken c=new chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class horse extends Animal{
    void walk(){
        System.out.println("walk on 4");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 leg");
    }
}