// find the sum of digit in number
import java.util.*;
public class sumnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum =0;
        int a;
        while(num!=0){
            a = num%10;
            sum+=a;
            num = num/10;

        } 
        System.out.println("the sum of number of digit is :"+sum);
    }
    
}
