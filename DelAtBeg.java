import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Linkedlist{
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void deletionAtBegining(int c){
        while(head != null && c>0){
            head = head.next;
            c--;
        }
    }
    public void print(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
public class DelAtBeg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linkedlist obj = new Linkedlist();
        System.out.println("Enter size:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            obj.insert(a);
        }
        System.out.println("Enter the no.of positions to be deleted:");
        int c = sc.nextInt();
        obj.deletionAtBegining(c);
        System.out.print("Linked list:");
        obj.print();
    }
}