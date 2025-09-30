import java.util.*;
public class BubbleSort{
    static void sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,n);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    } 
}