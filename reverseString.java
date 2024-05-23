import java.util.*;
public class reverseString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String  str = "abc";
        String s1 = str;
        int leng = (int)str.length();//here we use type casting
        String rev = " ";
        for(int i= leng-1;i>=0;i--){
            rev = rev+str.charAt(i);


        }
        System.out.println(s1);
        System.out.println(rev);
        if(s1.equals(rev)){
            System.out.println("this is palindromic");

        }
        else{
            System.out.println("this is not palindromic");
        }
    }
}