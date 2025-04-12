package TipeB;

public class dokter {
    private String antrean;
    private  String pasien;
    private String namaDokter;
    private String jenisDokter;


    public dokter(String antrean, String pasien, String namaDokter, String jenisDokter) {
        this.antrean = antrean;
        this.pasien = pasien;
        this.namaDokter = namaDokter;
        this.jenisDokter = jenisDokter;
    }

    public void setAntrean(String antrean) {
        this.antrean = antrean;
    }
    public void setJenisDokter(String jenisDokter) {
        this.jenisDokter = jenisDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public void setPasien(String pasien) {
        this.pasien = pasien;
    }


    public String getAntrean() {
        return antrean;
    }

    public String getJenisDokter() {
        return jenisDokter;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public String getPasien() {
        return pasien;
    }


    @Override
    public String toString(){
        return "antrean: " + antrean + "\nnama pasien: " + pasien + "\nnama dokter: " + namaDokter + "\njenis dokter: " + jenisDokter;
    }


}
