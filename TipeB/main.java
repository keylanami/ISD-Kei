package TipeB;

public class main {
    public static void main(String[] args) {
        RumahSakit<dokter> dokterUmum = new RumahSakit<>("Dokter Umum");
        RumahSakit<dokter> dokterSpesialis = new RumahSakit<>("Dokter Spesialis");

        dokterSpesialis.ambilNomor(new dokter("B001", "DOngsookie", "dr. mark lee", "dokter penyakit dalam"));
        dokterSpesialis.ambilNomor(new dokter("B002", "Kei-chan", "dr. minhyung", "dokter mata"));
        dokterSpesialis.ambilNomor(new dokter("B003", "Donghyuck", "dr. paprika", "dokter kulit"));

        dokterUmum.ambilNomor(new dokter("A001", "Sunghoon", "dr. Sunoo", "dokter umum"));
        dokterUmum.ambilNomor(new dokter("A002", "Yujin", "dr. wony", "dokter umum"));

        
        System.out.println("DOKTER SPESIASLIS");
        dokterSpesialis.panggilanPeriksa();
        System.out.println();

        dokterSpesialis.printAntrian();
        dokterSpesialis.ambilNomor(new dokter("B004", "Jeno", "dr.jaemin", "dokter THT"));
        dokterSpesialis.printAntrian();

        System.out.println("DOKETER UMUM");
        dokterUmum.ambilNomor(new dokter("A003", "Markie", "dr. katei", "dokter umum"));
        System.out.println();

        dokterUmum.panggilanPeriksa();
        System.out.println();
        dokterUmum.printAntrian();

    }
}
