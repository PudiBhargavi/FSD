import java.util.*;
class GraphDef{
    List<List<Integer>> adjList;
    GraphDef(int vertices){
        adjList = new ArrayList<>();
        for(int i=0;i<=vertices;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public void print(){
        for(int i=0;i<adjList.size();i++){
            System.out.print("List" + i + ":");
            List<Integer> nodes = adjList.get(i);
            Collections.sort(nodes);
            for(int j=0;j<nodes.size();j++){
                System.out.print(" "+nodes.get(j));
            }
            System.out.println();
        }
    }
}
public class Graph_List{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter no.of edges:");
        int m = sc.nextInt();
        GraphDef obj = new GraphDef(n);
        System.out.println("Enter edge:");
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u,v);
        }
        obj.print();
    }
}