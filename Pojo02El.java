public class Pojo02El implements Comparable<Pojo02El>{
    private String kode;
    private String nama;
    private String kategori;
    private String harga;
    private Integer stock;

    public Pojo02El (String kode, String nama, String kategori, String harga, Integer stock){
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stock = stock;
    }


    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }


    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass()!= obj.getClass()) {
            return false;
        }

        Pojo02El that = (Pojo02El) obj;

        return this.kode.equals(that.kode);
    }




    @Override
    public String toString() {
        return "Alat musik Elektronik: kode=" + kode + ", nama=" + nama + ", kategori=" + kategori + ", harga=" + harga
                + ", stock=" + stock;
    }

    @Override
    public int compareTo(Pojo02El o){
        return this.getKode().compareTo(o.getKode());
    }
    
}
