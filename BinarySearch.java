import java.util.*;
public class BinarySearch{
    public static int search(int[] arr,int n,int b){
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == b){
                return mid;
            }
            else if(b<arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int b = sc.nextInt();
        System.out.print("Element fount at:"+search(arr,n,b));
    }
}