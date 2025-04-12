package TipeC;

public class member {
    private String nama;
    private int noMember;
    private String alamat;
    private String tipeMember;
    private int lamaJadiMember;

    public member(String nama, int noMember, String alamat, String tipeMember, int lamaJadiMember){
        this.nama = nama;
        this.noMember = noMember;
        this.alamat = alamat;
        this.tipeMember = tipeMember;
        this.lamaJadiMember = lamaJadiMember;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setLamaJadiMember(int lamaJadiMember) {
        this.lamaJadiMember = lamaJadiMember;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNoMember(int noMember) {
        this.noMember = noMember;
    }

    public void setTipeMember(String tipeMember) {
        this.tipeMember = tipeMember;
    }


    public String getAlamat() {
        return alamat;
    }

    public int getLamaJadiMember() {
        return lamaJadiMember;
    }

    public String getNama() {
        return nama;
    }

    public int getNoMember() {
        return noMember;
    }
    
    public String getTipeMember() {
        return tipeMember;
    }

    

    @Override
    public String toString() {
        return "No: " + noMember + ", Nama: " + nama + ", Alamat: " + alamat + ", Tipe: " + tipeMember + ", Lama: " + lamaJadiMember + " tahun";
    }
}
