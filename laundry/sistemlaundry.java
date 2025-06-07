package laundry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sistemlaundry {
    List<Cucian> daftarLondri;

    public sistemlaundry(){
        daftarLondri = new ArrayList<>();
    }
    
    public void terimaCucian(int id, String nama, int tanggal, String tipe, int kilo){
        Cucian cucianBaru = new Cucian(id, nama, tanggal, tipe, kilo);
        daftarLondri.add(cucianBaru);
    }

    public void printUrutan(){
        Collections.sort(daftarLondri);

        System.out.println("Urutan cucian: ");
        for (Cucian cuci : daftarLondri) {
            System.out.println("idCuci: " + cuci.getId() + ", nama pelanggan = " + cuci.getNama());
        }
    }
}