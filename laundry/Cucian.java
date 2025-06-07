package laundry;
// BIKIN POJO, atrubut semuanya di sini
public class Cucian implements Comparable<Cucian> {
    private int id;
    private String nama;
    private int tanggalMasuk;
    private String tipeCucian;
    private int berat;

    public Cucian(int id, String nama, int tanggalMasuk, String tipeCucian, int berat) {
        this.id = id;
        this.nama = nama;
        this.tanggalMasuk = tanggalMasuk;
        this.tipeCucian = tipeCucian;
        this.berat = berat;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getTanggalMasuk() {
        return tanggalMasuk;
    }

    private int getWaktuSelesai() {
        return switch (tipeCucian) {
            case "biasa" -> tanggalMasuk + 3;
            case "express" -> tanggalMasuk + 2;
            case "kilat" -> tanggalMasuk + 1;
            default -> tanggalMasuk + 3;
        };
    }

    private int getprioritas(){
        return switch (tipeCucian){
            case "biasa" -> 3;
            case "express" -> 2;
            case "kilat" -> 1;
            default -> 3;
        };
    }

    @Override
    public int compareTo(Cucian b){
        int selesai = Integer.compare(this.getWaktuSelesai(), b.getWaktuSelesai());
        if (selesai != 0) return selesai;

        int prioritas = Integer.compare(this.getprioritas(), b.getprioritas());
        if (prioritas != 0) return prioritas;

        return Integer.compare(this.tanggalMasuk, b.getTanggalMasuk());
    }
}
