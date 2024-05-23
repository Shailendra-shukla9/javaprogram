// find largest of three number
import java.util.*;
public class checklargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your three val :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println("the greatest value is : A");
        }
        else if(b>a&&b>c){
            System.out.println("the greatest values is : B");
        }
        else{
            System.out.println("the greatest values is : C");
        }
    }
    
}
