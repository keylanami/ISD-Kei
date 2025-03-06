public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("607062400065", "Keyla Na", 
        "4802"); // template nim: nama: kelas: ini di-setting dari function @Override toString

        // kita bikin semacam TIPE DATA gitu, isinya template
        // variable 'mhs' namannya adjustable kok 
        System.out.println(mhs);


        // variable.set buat semacam input deh
        mhs.setNama("Kamisato Ayaka");
        System.out.println("Changed name: " + mhs.getNama()); // variable.get buat panggil yang ada di 'wadah' set

        mhs.setNim("60706240300");
        System.out.println("Changed NIM: " + mhs.getNim());
    }
}
