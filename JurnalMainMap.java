import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class JurnalMainMap {

    public static void main(String[] args) {
        HashMap<Integer, JurnalPojoMap> mapPemain = new HashMap<>();
        Set<JurnalPojoMap> setDuplikatData = new HashSet<>();

        Scanner s = new Scanner(System.in);

        JurnalPojoMap pemain1 = new JurnalPojoMap("Ayato", 25, "Main Visual");
        JurnalPojoMap pemain2 = new JurnalPojoMap("Diluc", 20, "Rapper");
        JurnalPojoMap pemain3 = new JurnalPojoMap("Haitham", 20, "Leader");
        JurnalPojoMap pemain4 = new JurnalPojoMap("Neuvillete", 25, "Vocalist");
        JurnalPojoMap pemain5 = new JurnalPojoMap("Wrio", 20, "Rapper");
        JurnalPojoMap pemain6 = new JurnalPojoMap("Ororon", 21, "Main dancer");

        int pemain1Code = pemain1.hashCode();
        int pemain2Code = pemain2.hashCode();
        int pemain3Code = pemain3.hashCode();
        int pemain4Code = pemain4.hashCode();
        int pemain5Code = pemain5.hashCode();
        int pemain6Code = pemain6.hashCode();

        mapPemain.put(pemain1Code, pemain1);
        mapPemain.put(pemain2Code, pemain2);
        mapPemain.put(pemain3Code, pemain3);
        mapPemain.put(pemain4Code, pemain4);
        mapPemain.put(pemain5Code, pemain5);
        mapPemain.put(pemain6Code, pemain6);

        System.out.println("Daftar Member:");
        for (Map.Entry<Integer, JurnalPojoMap> entry : mapPemain.entrySet()) {
            System.out.println("\nKode Pemain : " + entry.getKey() + "\n" + entry.getValue());
        }
        System.out.println();

        JurnalPojoMap[] daftarPemain = { pemain1, pemain2, pemain3, pemain4, pemain5, pemain6 };

        for (JurnalPojoMap pemain : daftarPemain) {
            if (setDuplikatData.contains(pemain)) {
                System.out.println("Duplikasi terdeteksi:\n" + pemain);
            } else {
                setDuplikatData.add(pemain);
                mapPemain.put(pemain.hashCode(), pemain);
            }
        }

        System.out.print("\nMasukkan key: ");
        int keyCari = s.nextInt();
        cariDataPemain(mapPemain, keyCari);

    }

    public static void cariDataPemain(Map<Integer, JurnalPojoMap> map, int key) {
        if (map.containsKey(key)) {
            System.out.println(map.get(key));
        } else {
            System.out.println("Tidak ada data pemain.");
        }
    }
}
