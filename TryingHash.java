import java.util.HashMap;

public class TryingHash {

    public static void main(String[] args) {
        
        HashMap<String, String> loker = new HashMap<>();


        // this wont collide
        loker.put("Mark", "laprak");
        loker.put("Kei", "pencil case");
        loker.put("Haechan", "calculator");
         
        System.out.println("Punya Mark: " + loker.get("Mark"));
        System.out.println("Punya Haechan: " + loker.get("Haechan"));
        System.out.println("Punya Kei: " + loker.get("Kei"));


        System.out.println("\nHaechan mau pulang");
        loker.remove("Haechan");

        System.out.println("\nIs Haechan's stuff placed there? ");
        if (loker.get("Haechan")== null) {
            System.out.println("Nope, not here");
        } else {
            System.out.println("Yea, it's here, his " +  loker.get("Haechan"));
        }

        System.out.println("\nOk mau tengok history orang dan barang yang ditaroh di lokernya!");
        for (String nama : loker.keySet()){
            System.out.println("- "  + nama + " naroh " + loker.get(nama));
        }

    }
}