package Jurnal;

public class main {

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(8);

        graph.addEdges('A', 'H');
        graph.addEdges('A', 'B');
        graph.addEdges('A', 'C');
        graph.addEdges('B', 'A');
        graph.addEdges('B', 'D');
        graph.addEdges('D', 'E');
        graph.addEdges('E', 'F');
        graph.addEdges('F', 'G');
        graph.addEdges('G', 'C');
        graph.addEdges('C', 'A');


        System.out.println("BFS: ");
        graph.bfs('A');
        
        System.out.println("\n");

        System.out.println("DFS: ");
        graph.dfs('A');
    }
}