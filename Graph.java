import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
    private List<City> peta = new ArrayList<>();


        public void addCity(City city) {
            peta.add(city);
        }
    
        public void addPath(City dari, City ke){
            dari.tambahTetangga(ke);
            ke.tambahTetangga(dari);
        }
    


        public void bfs(City start) {
    
            System.out.println("dira jalan jalan visiting nearest city");
            Set<City> visited = new HashSet<>();
            Queue<City> antre = new LinkedList<>();
    
    
            visited.add(start);
            antre.add(start);
    
            while (!antre.isEmpty()) {
                City sekarang = antre.poll();
                System.out.println(sekarang);
    
    
                for (City neighbour : sekarang.getTetangga()) {
                    if (!visited.contains(neighbour)) {
                        visited.add(neighbour);
                        antre.add(neighbour);
                        
                    }
                }
            }
        }
    
    

        public void dfs(City start) {
            System.out.println("dira jalan jalan visiting rute menjauh");
            Set<City> visited = new HashSet<>();
    
            recurseDFS(start, visited);
        }
    
    
        public void recurseDFS(City sekarang, Set<City> visited) {
            visited.add(sekarang);
            System.out.println(sekarang);
    
            for (City neighbour : sekarang.getTetangga()) {
                if (!visited.contains(neighbour)) {
                    recurseDFS(neighbour, visited);
                }
            }
        }
        
    }


   