import java.util.*;
public class checkarray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int arr[] = new int[4];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("this is even "+arr[i]);
            }
            else{
                System.out.println("this is odd array"+arr[i]);
            }
        }

    }
    
}
