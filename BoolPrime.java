import java.util.*;
public class BoolPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean bool = true;
        if(n<=1){
            bool = false;
        }
        for(int i=2;i<n-1;i++){ //i= n/2
            if(n%i == 0){
                bool = false;
                break;
            }
        }
        if(bool){
            System.out.print("Prime!!!!");
        }
        else{
            System.out.print("Not Prime!!!!");
        }
    }
}