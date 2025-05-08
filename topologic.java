
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class topologic {
    
    private Map<String, List<String>> adjList;
    private Map<String, Integer> inDegree;


    public topologic(){
        adjList = new HashMap<>();
        inDegree = new HashMap<>();
    }


    public void addVertex(String v){
        if (!adjList.containsKey(v)) {
            adjList.put(v, new ArrayList<>());
            inDegree.put(v, 0);
        }
    }


    public void addEdge(String source, String dest){
        adjList.get(source).add(dest);
        inDegree.put(dest, inDegree.get(dest)+ 1);
    }


    public List<String> topologicalSort(){
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

            for (String neighbor : adjList.get(vertex)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);

                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (sorted.size() != adjList.size()) {
            return null;
        }

        return sorted;
    }
}

