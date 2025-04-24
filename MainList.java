public class MainList {

    public static void main(String[] args) {
        AdjacencyList graf = new AdjacencyList(5);

        graf.addEdges(1, 2);
        graf.addEdges(2, 3);
        graf.addEdges(3, 4);
        graf.addEdges(4, 2);
        graf.addEdges(4, 3);
        graf.addEdges(4, 5);
        graf.addEdges(5, 1);

        graf.printGRaph();
    }
}