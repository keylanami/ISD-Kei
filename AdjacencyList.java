import java.util.LinkedList;

public class AdjacencyList {  
    int n;
    LinkedList<Integer> adjListArr[];

    AdjacencyList(int n){
        this.n = n;
        adjListArr = new LinkedList[n];
        

        for(int i = 0; i < n; i++){
            adjListArr[i] = new LinkedList<>();
        }
    }

    public void addEdges(int src, int dest){
        adjListArr[src - 1].add(dest);
    }

    public void printGRaph(){
        for(int i = 0; i < n; i++){
            System.out.print("Vertex " + (i+1) + " is connected to: ");
            for(int j = 0; j < adjListArr[i].size(); j++){
                System.out.print(adjListArr[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
