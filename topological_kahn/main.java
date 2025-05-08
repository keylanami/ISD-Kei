package topological_kahn;

public class main {

    public static void main(String[] args) {
        graph graf = new graph();

        graf.addVertex("Hologram");
        graf.addVertex("Kostum");
        graf.addVertex("Pengepasan kostum");
        graf.addVertex("Kontak tim lain");
        graf.addVertex("Pembuatan panggung");
        graf.addVertex("Persiapan panggung");
        graf.addVertex("Pencahayaan");
        graf.addVertex("Properti panggung");

        graf.addEdge("Hologram", "Kostum");
        graf.addEdge("Kostum", "Pengepasan kostum");
        graf.addEdge("Kostum", "Pembuatan panggung");
        graf.addEdge("Kostum", "Pencahayaan");
        graf.addEdge("Kontak tim lain", "Pengepasan kostum");
        graf.addEdge("Kontak tim lain", "Persiapan panggung");
        graf.addEdge("Persiapan panggung", "Pembuatan panggung");
        graf.addEdge("Properti panggung", "Kostum");
        graf.addEdge("Properti panggung", "Persiapan panggung");

        System.out.println(graf.topologicalSort());
    }
}