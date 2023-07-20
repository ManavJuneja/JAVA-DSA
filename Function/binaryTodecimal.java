package Function;

public class binaryTodecimal {
    public static void bintodec(int bindec ){
        int pow=0;
        int decNum=0;
        int binNum;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2, pow))
        }
    }

    public static void main(String[] args) {
        
    }
}
