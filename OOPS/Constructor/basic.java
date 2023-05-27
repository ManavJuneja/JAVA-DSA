package OOPS.Constructor;

public class basic {
    public static void main(String[] args) {
        Student s1=new Student("manav");
        System.out.println(s1.name);
        
    }
}
class Student{
    String name;
    int roll;
    Student(String name){
        this.name=name;
    }
}
