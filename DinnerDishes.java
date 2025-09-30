import java.util.*;
public class DinnerDishes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        if(n<2){
            System.out.print(0);
            return;
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
        System.out.print(arr[n-1] + arr[n-2]);
    }
}