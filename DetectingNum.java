import java.util.*;
public class DetectingNum{ //perfect number detection for vault security
      static int perfect(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        if(n == sum){
            return 1;
        }
        else{
            return sum;
        }
    }
    public static void main(String[] args){   // without using static we need to use an obj creation to call the obj
        Scanner sc = new Scanner(System.in);    // Main obj = new Main()  it is a non static
        int n = sc.nextInt();     // obj.perfect  because an obj is an instance of an class so without creating an obj without using static we cannot call the obj
        System.out.println(perfect(n));
    }
}