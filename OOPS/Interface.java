package OOPS;

public class Interface {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,rigth,diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,rigth");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down");
    }
}

