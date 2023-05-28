package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish Shark=new Fish();
        Shark.eat();
        
    }
}
//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");;
    }
}
//Derived Class
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Swims");
    }
}
