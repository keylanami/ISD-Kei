public class Pojo02Tradi implements Comparable<Pojo02Tradi> {
    private String kode;
    private String nama;
    private String kategori;
    private String harga;
    private Integer stock;

    public Pojo02Tradi (String kode, String nama, String kategori, String harga, Integer stock){
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stock = stock;
    }


    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public String getHarga() {
        return harga;
    }

    public Integer getStock() {
        return stock;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public void setHarga(String harga) {
        this.harga = harga;
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

        Pojo02Tradi that = (Pojo02Tradi) obj;

        return this.kode.equals(that.kode);
    }



    @Override
    public String toString() {
        return "Alat musik tradi \skode=" + kode + ", nama=" + nama + ", kategori=" + kategori + ", harga=" + harga
                + ", stock=" + stock;
    }

    @Override
    public int compareTo(Pojo02Tradi o){
        return this.getKode().compareTo(o.getKode());
    }
}
