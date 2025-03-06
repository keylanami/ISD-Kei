import java.util.ArrayList;

public class Jurnal02 {
    public static void main(String[] args) {
        Jurnal02Toko<Pojo02Tradi> toko1 = new Jurnal02Toko<>(0);
        Jurnal02Toko<Pojo02El> toko2 = new Jurnal02Toko<>(0);

        toko1.addData(new Pojo02Tradi("T005", "Angklung", "Tradi", "1500000", 10));
        toko1.addData(new Pojo02Tradi("T001", "Gamelan", "Tradi", "77000000", 2));
        toko1.addData(new Pojo02Tradi("T004", "Sasando", "Tradi", "1000000", 30));
        toko1.addData(new Pojo02Tradi("T002", "Kecapi", "Tradi", "8000000", 12));
        toko1.addData(new Pojo02Tradi("T003", "Tifa", "Tradi", "900000", 3));

        toko2.addData(new Pojo02El("E004", "Piano", "Elektronik", "1000000000", 2));
        toko2.addData(new Pojo02El("E003", "Electric Guitar", "Elektronik", "10000000", 12));
        toko2.addData(new Pojo02El("E005", "Violin", "Elektronik", "100000000", 2));
        toko2.addData(new Pojo02El("E001", "Cello", "Elektronik", "7000000", 2));
        toko2.addData(new Pojo02El("E002", "Flute", "Elektronik", "1000000", 22));


        //ngeprint
        toko1.displaySort();
        toko2.displaySort();

        //buat ngecheck validitas double atau nggak
        toko1.addData(new Pojo02Tradi("T001", "Gamelan", "Tradi", "77000000", 2)); 
        toko2.addData(new Pojo02El("E001", "Keyboard", "Elektronik", "5000000", 5));

        

    }
}
