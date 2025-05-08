package topological_kahn2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class graph {
    HashMap <String, List<String>> adjaList;
    HashMap <String, Integer> inDegree;

    public graph(){
        adjaList = new HashMap<>();
        inDegree = new HashMap<>();
    }

    public void addVertex(String v){
        adjaList.put(v, new ArrayList<>());
        inDegree.put(v, 0);
    }

    public void addEdge(String source, String dest){
        adjaList.get(source).add(dest);
        inDegree.put(dest, inDegree.get(dest) + 1);
    }

    public List<String> toposort(){
        List<String> sorted = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        for (String vertex : inDegree.keySet()) {
            if (inDegree.get(vertex) == 0) {
                queue.offer(vertex);
            }
        }

        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            sorted.add(vertex);


            for (String neighbor : adjaList.get(vertex)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);

                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (sorted.size() != adjaList.size()) {
            return null;
        }

        return sorted;
    }
}