package TipeB;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class RumahSakit<E> {
private Queue<E> listAntrean;
private String jenisDokter;

    public RumahSakit(String jenisDokter){
        this.jenisDokter = jenisDokter;
        listAntrean = new LinkedList<>();
    }
    

    public void ambilNomor(E object){
        listAntrean.add(object);

        System.out.println("Kamu pasien " + jenisDokter);
        if (listAntrean.size() > 1 && jenisDokter.equalsIgnoreCase("Dokter Umum")) {
            System.out.println("Kamu nunggu " + (listAntrean.size() - 1) + " orang lagi");
        }
    }


    public void panggilanPeriksa(){
        if (!listAntrean.isEmpty()) {
            E pasien = listAntrean.poll();
            System.out.println("Nomor " + ((dokter) pasien).getAntrean() + " dengan nama " + ((dokter) pasien).getPasien() + " untuk " + ((dokter) pasien).getNamaDokter() + ", pasien " + ((dokter) pasien).getJenisDokter() + " silakan ke ruang periksa");
        } else {
            System.out.println("langsung masuk aja, ga ngantri");
        }
    }


    public void printAntrian(){
        System.out.println("list antrian " + jenisDokter + ": ");
        for (E pasien : listAntrean) {
            System.out.println(pasien + "\n");
        }
    }
}