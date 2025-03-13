public class PojoBuku {

    private String isbn;
    private String judul;
    private String kategori;
    private int harga;
    private boolean status;

    public PojoBuku(String isbn, String judul, String kategori, int harga, boolean status){
        this.isbn = isbn;
        this.judul = judul;
        this.kategori = kategori;
        this.harga = harga;
        this.status = status;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

@Override
public String toString(){
    if (status == false) {
        return "ISBN: " + isbn + ", Judul Buku: " + judul + ", Kategori: " + kategori + ", Harga buku: " + harga + ", Status: " + "Unavailable";
    } else {
        return "ISBN: " + isbn + ", Judul Buku: " + judul +  ", Kategori: " + kategori + ", Harga buku: " + harga + ", Status: " + "Available";
    }
}


}