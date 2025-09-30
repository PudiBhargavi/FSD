import java.util.*;
public class ConsecutiveNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
         for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }
        boolean bool = true;
        for(int i=1;i<n;i++){
            if(arr[i] - arr[i-1] != 1){
                bool = false;
                break;
            }
        }    
        if(bool){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}