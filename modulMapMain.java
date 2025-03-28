import java.util.HashMap;
import java.util.Map;

public class modulMapMain {
    public static void main(String[] args) {
        
    HashMap<Integer, modulMapPemain> mapPemain = new HashMap<>();

    //  add data
    modulMapPemain player1 = new modulMapPemain("Hinata Shoyo", "Spiker");
    modulMapPemain player2 = new modulMapPemain("Tobio Kageyama", "Setter");
    modulMapPemain player3  = new modulMapPemain("Kei Tsukishima", "Blocker");
    modulMapPemain player4 = new modulMapPemain("Yu Nishinoya", "Libero");
    modulMapPemain player5 = new modulMapPemain("Koshi Sugawara", "Setter");
    modulMapPemain player6 = new modulMapPemain("Asahi Azumane", "Spiker");
    modulMapPemain player7 = new modulMapPemain("Hinata Shoyo", "Spiker");
    
    // HASHING. hashcodenya buat key ntar
    int p1code = player1.hashCode();
    int p2code = player2.hashCode();
    int p3code = player3.hashCode();
    int p4code = player4.hashCode();
    int p5code = player5.hashCode();
    int p6code = player6.hashCode();
    int p7code = player7.hashCode();


    // masukkin p%dcode as KEY dan player%d as VALUE ke hashmap. 
    mapPemain.put(p1code, player1);
    mapPemain.put(p2code, player2);
    mapPemain.put(p3code, player3);
    mapPemain.put(p4code, player4);
    mapPemain.put(p5code, player5);
    mapPemain.put(p6code, player6);
    mapPemain.put(p7code, player7);

    System.out.println("KARASUNO");

    //Map.entry buat cal
    for(Map.Entry<Integer, modulMapPemain> entry : mapPemain.entrySet()) { // iterate kode player & namanya

        System.out.println("Player's code: " + entry.getKey() + "\n" + entry.getValue());
    }


    // pointing to nama dan hashcodenya sama apa nggak
    System.out.println("Check duplikasi player!");
    if (player1.equals(player7) && p1code == p7code) {
        System.out.println("P1 dan P7 adalah pemain yang sama");
    } else {
        System.out.println("P1 dan P7 berbeda");
    }
    
    }
}
