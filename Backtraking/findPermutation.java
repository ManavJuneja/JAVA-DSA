package Backtraking;

public class findPermutation {
    public static void findpermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //abcde=>ab+de=abde
            String NewStr=str.substring(0, i)+str.substring(i, i+1);
            findpermutation(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findpermutation(str,"");
    }
}
