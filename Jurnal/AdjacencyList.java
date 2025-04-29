package Jurnal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyList {  
    int n;
    LinkedList<Character> adjListArr[];

    AdjacencyList(int n){
        this.n = n;
        adjListArr = new LinkedList[n];
        

        for(int i = 0; i < n; i++){
            adjListArr[i] = new LinkedList<>();
        }
    }

    public void addEdges(char src, char dest){
        adjListArr[src - 'A'].add(dest);
        adjListArr[dest - 'A'].add(src);
    }



    public void bfs (char start) {
        boolean[] visited = new boolean[n];
        Queue<Character> queue = new LinkedList<>();

        visited[start - 'A'] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            char node = queue.poll();
            System.out.print((node) + " ");

            for (int neighbor : adjListArr[node - 'A']) {
                if (!visited[neighbor - 'A']) {
                    visited[neighbor - 'A'] = true;
                    queue.add((char) neighbor);
                }
            }
        }
    }

    public void dfs (char start){
        boolean[] visited = new boolean[n];
        Stack<Character> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            char node = stack.pop();
            
            if (!visited[node - 'A']) {
                visited[node - 'A'] = true;
                System.out.print(node + " ");
            
            LinkedList<Character> neighbor = adjListArr[node - 'A'];
            for(int i = 0; i < neighbor.size(); i++){
                char tetangga = neighbor.get(i);
                if (!visited[tetangga - 'A']) {
                    stack.push(tetangga);
                }
            }
        }
    }
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