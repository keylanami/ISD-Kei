import java.util.LinkedList;

//originally coded fully 100% by keyla namira johan 607062400065 D3IF-48-02

public class queueMainJurnal {
    public static void main(String[] args) {
        manajemen<String> angkringan = new manajemen<>();

        //ni buat add list
        angkringan.enqueue("Reimu");
        angkringan.enqueue("Marisa");
        angkringan.enqueue("Keine");
        angkringan.enqueue("Mokou");
        angkringan.enqueue("Eirin");
        
        // check antrian
        System.out.println("Antrian saat ini: ");
        angkringan.printQueue();

        System.out.print("Ada ");
        angkringan.adaBerapa();
        System.out.print(" orang yang lagi ngantri");
        
        
        // 2 orang kelar
        angkringan.dequeue();
        System.out.println("\nReimu selesai antri");
        
        angkringan.dequeue();
        System.out.println("Marisa selesai antri");
        
        // update antrian
        System.out.println("\nAntrian saat ini: ");
        angkringan.printQueue();
        System.out.print("Ada ");
        angkringan.adaBerapa();
        System.out.print(" orang yang lagi ngantri");

        
    }
}
