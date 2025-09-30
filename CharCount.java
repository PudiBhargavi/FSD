import java.util.*;
public class CharCount{ //String - Character count
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = sc.nextInt();
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<length;i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.print(count);
    }
}