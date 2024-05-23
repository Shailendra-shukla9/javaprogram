// count the number of odd and even in an number
import java.util.*;
public class check {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number as you want");
        int num = sc.nextInt();
        int even = 0;
        int odd =0;
        int a;
        while(num!=0){
            a = num%10;
            if(a%2==0){
                even++;
            }
            else{
                odd++;
            }
            num = num/10;

        }
        System.out.println("the number of even digit is:"+even);
        System.out.println("the number of odd digit is :"+odd);
    }
}
