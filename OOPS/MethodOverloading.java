package OOPS;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.sum(1, 2, 3);
        calc.sum(2, 5);
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}