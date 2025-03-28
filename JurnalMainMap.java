import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class JurnalMainMap {

    public static void main(String[] args) {
        HashMap<Integer, JurnalPOJOMap> nct = new HashMap<>();
        Scanner searchKey = new Scanner(System.in);

        JurnalPOJOMap member1 = new JurnalPOJOMap("Mark", 26, "Main Rapper");
        JurnalPOJOMap member2 = new JurnalPOJOMap("Haechan", 25, "Main vocalist");
        JurnalPOJOMap member3 = new JurnalPOJOMap("Ten", 29, "Vocalist");
        JurnalPOJOMap member4 = new JurnalPOJOMap("Jeno", 25, "Rapper");
        JurnalPOJOMap member5 = new JurnalPOJOMap("Yangyang", 25, "Lead Vocalist");
        JurnalPOJOMap member6 = new JurnalPOJOMap("Sungchan", 24, "Rapper");
        JurnalPOJOMap member7 = new JurnalPOJOMap("Winwin", 28, "Vocalist");
        JurnalPOJOMap member8 = new JurnalPOJOMap("Mark", 26, "Main Rapper");


        int m1code = member1.hashCode();
        int m2code = member2.hashCode();
        int m3code = member3.hashCode();
        int m4code = member4.hashCode();
        int m5code = member5.hashCode();
        int m6code = member6.hashCode();
        int m7code = member7.hashCode();
        int m8code = member8.hashCode();
        
        nct.put(m1code, member1);
        nct.put(m2code, member2);
        nct.put(m3code, member3);
        nct.put(m4code, member4);
        nct.put(m5code, member5);
        nct.put(m6code, member6);
        nct.put(m7code, member7);
        nct.put(m8code, member8);

        System.out.println("NCT 90's Love Unit");
       
        for(Map.Entry<Integer,JurnalPOJOMap> member : nct.entrySet()){
            System.out.println("Member Code: " + member.getKey() + "\n" + member.getValue());

        }

        System.out.println("Cari Member: masukkan key");
        int search = searchKey.nextInt();

        if (nct.containsKey(search)) {
            System.out.println(nct.get(search));
        } else {
            System.out.println("Member not found :(");
        }

        
        HashSet<JurnalPOJOMap> checkDupe = new HashSet<>();

        for (Map.Entry<Integer, JurnalPOJOMap> entry1 : nct.entrySet()) {
        if (checkDupe.contains(entry1.getValue())) {
            System.out.println("Dupe found:\n" + entry1.getValue());
        } else {
            checkDupe.add(entry1.getValue());
        }
    }

    }
}