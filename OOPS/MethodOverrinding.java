package OOPS;

public class MethodOverrinding {
    public static void main(String[] args) {
        Animal you=new Animal();
        you.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("parent class");
    }
}
class mammal extends Animal{
    public void eat(){
        System.out.println("Derived class");
    }
}