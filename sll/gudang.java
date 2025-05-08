package sll;

public class gudang {
    private String barang;
    private int harga;
    private int stok;

    public gudang(String barang, int harga, int stok){
        this.barang = barang;
        this.harga = harga;
        this.stok= stok;

    }

    public String getBarang() {
        return barang;
    }

    public int getHarga() {
        return harga;
    }
    
    public int getStok() {
        return stok;
    }


    public void setBarang(String barang) {
        this.barang = barang;
    }


    public void setHarga(int harga) {
        this.harga = harga;
    }


    public void setStok(int stok) {
        this.stok = stok;
    }
    

    @Override
    public String toString() {
        return "[ " + barang +  " | " + harga + " | " + stok + " ] " + " -> ";
    }
}
