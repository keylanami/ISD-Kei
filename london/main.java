package london;

public class main {
    public static void main(String[] args) {
        Graphlondon graf = new Graphlondon();

        City London = new City("London");
        City Salisbury = new City("Salisbury");
        City Bristol = new City("Bristol");
        City Birmingham = new City("Brimingham");
        City Cardiff = new City("Cardiff");
        City Manchester = new City("Manchester");
        City Kingston = new City("Kingston");
        City Liverpool = new City("Liverpool");
        City Newcastle = new City("Newcastle");
        City Edinburgh = new City("Edinburgh");
        City Glasglow = new City("Glasgow");


        graf.addCity(London);
        graf.addCity(Salisbury);
        graf.addCity(Bristol);
        graf.addCity(Birmingham);
        graf.addCity(Cardiff);
        graf.addCity(Manchester);
        graf.addCity(Kingston);
        graf.addCity(Liverpool);
        graf.addCity(Newcastle);
        graf.addCity(Edinburgh);
        graf.addCity(Glasglow);
        

        
        graf.addPath(London, Kingston);
        graf.addPath(London, Salisbury);
        graf.addPath(London, Birmingham);

        graf.addPath(Salisbury, Bristol);
        graf.addPath(Bristol, Cardiff);

        graf.addPath(Birmingham, Manchester);
        graf.addPath(Birmingham, Bristol);
        graf.addPath(Birmingham, Cardiff);

        graf.addPath(Manchester, Liverpool);
        graf.addPath(Manchester, Newcastle);

        graf.addPath(Newcastle, Edinburgh);
        graf.addPath(Edinburgh, Glasglow);


        graf.bfs(London);

        System.out.println();
        graf.dfs(London);
    }
}
