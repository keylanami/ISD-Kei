
// this one is POJO
public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    
// this one is CONSTRUCTOR
    public Mahasiswa (String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;

        
    }

// to string, template buat apa yang nanti bakal diprint
    @Override
    public String toString() {
        return "nim = " + nim + ", nama = " + nama + ", kelas = " + kelas;
    }

// setter
    public void setNama (String nama){
        this.nama = nama;
    }

// getter
    public String getNama() {
        return nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }
}