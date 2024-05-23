import java.util.*;
public class validity {
    public static String isbalanced(String str){
        Stack<Character> Stack = new Stack<>();
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='('||c=='{'||c=='['){
               Stack.push(c);
            }
            else{
                if(Stack.isEmpty()){
                    return "false";
                }
                else if(c==')'&& Stack.peek()=='('){
                    Stack.pop();
                }
                else if( c=='}'&& Stack.peek()== '{'){
                    Stack.pop();

                }
                else if ( c ==']'&& Stack.peek() == '['){
                    Stack.pop();
                }
            }
        }
        if(Stack.isEmpty()){
            return "true";
        }
        else{
            return "false";
        }
    }
    
    

    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        String result = isbalanced(s);
        System.out.println(result);
       
    }

    }
    

