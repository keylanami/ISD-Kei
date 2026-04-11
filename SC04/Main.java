package SC04;
public class Main {
    public static void main(String[] args) {
        
        Parkir mobil = new Parkir();

        mobil.masuk("B 1234 ABC");
        mobil.masuk("D 5678 DEF");
        mobil.masuk("F 9012 GHI");

        mobil.tampilinSemuaMobilYangParkir();

        mobil.keluar();

        mobil.tampilinSemuaMobilYangParkir();
        mobil.cekYangKeluarBerikutnya();

        mobil.keluar();

        mobil.cekYangKeluarBerikutnya();
        mobil.keluar();

        mobil.cekYangKeluarBerikutnya();


    }
}
