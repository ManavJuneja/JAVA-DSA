package OOPS;

public class Inheritance2 {
    public static void main(String[] args) {
        dog mauli=new dog();
        mauli.legs();
        mauli.mindset();
    }
}
class Animal{
    String legs;
    void legs(){

        System.out.println("Walk");
    }
    public void eat() {
    }

}
class mammal extends Animal{
      String mindset;
      void mindset(){
        System.out.println("mind");
           
      }
      }
      class dog extends mammal{
        String breed;
      }

