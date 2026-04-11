import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    private Queue<String> dokumen;


    public Printer(){
        dokumen = new LinkedList<>();
    }



    public void tambahDokumen(String docs){
        System.out.println(docs + " ditambahkan ke antrean");
        dokumen.add(docs);
    }

    public void prosesDokumen(){
        if (dokumen.isEmpty()) {
            System.out.println("ga ada dokumen yang mau diproses");
        } else {
            System.out.println("Sedang ngeprint.. " + dokumen.poll());
        }
    }

    public void nampilinAntrean(){
        System.out.println("Antrian: ");

        int n = 1;
        for (String docs : dokumen) {
            System.out.println(n + ". " + docs);
            n++;
        }
    }

    public void tampilinDokumenPalingDepan(){
        if (dokumen.isEmpty()) {
            System.out.println("ga ada dokumen lagi");
        } else {
            System.out.println("paling depan: " + dokumen.peek());
        }
    }

    public void jumlahAntrean(){
        System.out.println("jumlah antrean sekarang ada: " + dokumen.size());
    }

}
