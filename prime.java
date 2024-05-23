
// check the number is prime or not 
import java.util.*;
public class prime{
    public static void main(String args[]){
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
            }}
            if(count==2)
            System.out.println("this is prime number");
            else
            System.out.println("this is not a prime number");

        }
        else{
            System.out.println("this is not a prime number ");
    
    }
    }
}