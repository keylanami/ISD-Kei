public class Main {
    public static void main(String[] args) {
        
        Printer printer = new Printer();

        printer.tambahDokumen("tugas_struktur_data.docx");
        printer.tambahDokumen("laporan1.pdf");
        printer.tambahDokumen("revisi_final.pdf");

        printer.nampilinAntrean();

        printer.prosesDokumen();

        printer.nampilinAntrean();

        printer.tampilinDokumenPalingDepan();
        

    }
}
