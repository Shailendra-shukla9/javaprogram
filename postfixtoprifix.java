import java.util.*;
public class postfixtoprifix { 
    public static void main(String args[]){
        Stack<String> val = new Stack<>();
        String str ="953+4*6/-";
        for(int i = 0;i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48&& ascii <=58){
                String s = ""+ ch;
                val.push(s);

            }
            else if(ch=='*'|| ch =='+'|| ch =='-'|| ch=='/'){
                String v2 = val.pop();
                String v1 = val.pop();
                String tt= ch+v1+ v2;
                val.push(tt);

            }
        }
        System.out.println(val.peek());
    }
    
}
