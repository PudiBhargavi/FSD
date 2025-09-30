import java.util.*;
class Graphdef{
    int[][] matrix;
    int vertex;
    Graphdef(int vertex){
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }
    public void addEdge(int u, int v){
        matrix[u-1][v-1] = 1;
        matrix[v-1][u-1] = 1;
    }
    public void print(){
        for(int i=0;i<vertex;i++){
            for(int j =0;j<vertex;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Graph{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter no.of edges:");
        int m = sc.nextInt();
        Graphdef obj = new Graphdef(n);
        System.out.println("Enter edge:");
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u,v);
        }
        obj.print();
    }
}