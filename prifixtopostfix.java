import java.util.*;
public class prifixtopostfix {
    public static void main (String args[]){
        
                Stack <String> val = new Stack<>();
                String str = "-9/*+5346";
                for(int i = str.length() -1; i>= 0; i--){
                    char ch = str.charAt(i);
                    int ascii = (int)ch;
                   if(ascii>=48 && ascii<=58){
                    String s = ""+ ch;
                    val.push(s);
                   }
                   else if(ch=='*'|| ch =='-'|| ch=='+'|| ch =='/'){
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = ch;
                    String t = v1+v2+ o;
                    val.push(t);

                   }
                }
                System.out.println(val.peek());


    }
}
    

