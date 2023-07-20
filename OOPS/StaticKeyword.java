package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.SchoolName="asdf";
        
    }
}
class Student{
    String name;
    int roll;
    static String SchoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}