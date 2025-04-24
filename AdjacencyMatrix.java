public class AdjacencyMatrix {
    int n;
    boolean[][] matrix;

    AdjacencyMatrix(int n){
        this.n = n;
        matrix = new boolean[n][n];
    }

    public void addEdge(int i, int j){
        matrix[i-1][j-1] = true;
    }

    public void removeEdge(int i, int j){
        matrix[i-1][j-1] = false;
    }

    public boolean hasEdge(int i, int j){
        return matrix[i-1][j-1];
    }


    public void printMatrix(){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
