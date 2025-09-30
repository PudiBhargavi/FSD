import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
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
        newNode.prev = current;
    }
    public void print(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
public class DoubleLinkAtEnd{
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
        System.out.print("Linked list:");
        obj.print();
    }
}