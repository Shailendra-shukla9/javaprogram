import java.util.*;
    public class isbalanced{
            public static String isbalanced(String str){
             int count = 0; 
             for(int i = 0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch == '('|| ch =='{'|| ch == '['){
                    count++;
                 
                }
                else if(ch ==')'|| ch == '}'|| ch == ']'){
                    count--;
                }
               
              
            }
            
            if(count ==0){
                return "true";
            }
            else {
                return "false";
            }
           
          
             }
            
            
            
        public static void main(String []argh)
        {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(isbalanced(s));
            
            }}
    
    
    
    

