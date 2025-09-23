public class Main {
    
    public static void main(String[] args) {
        Graph itinerary = new Graph();


        City paris =  new City("Paris (france)");
        City brus = new City("Brussels (belgium)");
        City zuri = new City("zurich (swiss)");
        City amster = new City("Amsterdam (Netherlands)");
        City vien = new City("VIenna (austria)");
        City prag = new City("Prague (Czechia)");
        City ham = new City("hamburg (Jerman)");
        City wars = new City("Warsaw (Polannd)");
        City budap = new City("Budapest (Hungary");

        itinerary.addCity(paris);
        itinerary.addCity(brus);
        itinerary.addCity(zuri);
        itinerary.addCity(amster);
        itinerary.addCity(vien);
        itinerary.addCity(prag);
        itinerary.addCity(ham);
        itinerary.addCity(wars);
        itinerary.addCity(budap);
        
        itinerary.addPath(paris, brus);
        itinerary.addPath(paris, zuri);
        itinerary.addPath(brus, amster);
        itinerary.addPath(brus, zuri);
        itinerary.addPath(amster, prag);
        itinerary.addPath(amster, ham);
        itinerary.addPath(zuri, prag);
        itinerary.addPath(ham, prag);
        itinerary.addPath(zuri, vien);
        itinerary.addPath(ham, wars);
        itinerary.addPath(wars, prag);
        itinerary.addPath(wars, budap);
        itinerary.addPath(prag, vien);
        itinerary.addPath(budap, vien);


        itinerary.bfs(paris);
        System.out.println();
        itinerary.dfs(paris);
        
    }
}
