import java.util.*;
public class Details{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int age = sc.nextInt();
        double cgpa = sc.nextDouble();
        char ch = sc.next().charAt(0);
        double c = (Math.floor(cgpa*100))/100;
        System.out.println("Name:"+ s);
        System.out.println("Age:" + age);
        System.out.println("Cgpa:"+ c);
        System.out.println("Grade:"+ ch);
    }
}