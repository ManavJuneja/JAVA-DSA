package OOPS;

public class AccesSpecifier {
    public static void main(String[] args) {
        BankAccount myAcc=new BankAccount();
        myAcc.username="Manav";
        myAcc.setPassword("abcd");
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
