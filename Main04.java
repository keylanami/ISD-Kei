import java.util.LinkedList;
import java.util.ListIterator;

public class Main04 {
    
    //ORIGINALLY CODED BY KEYLA NAMIRA JOHAN 607062400065 D3IF-48-02
    public static void main(String[] args) {
        LinkedList<PojoBuku> rental = new LinkedList<>();
        ListIterator<PojoBuku> iterator = rental.listIterator();

        rental.addFirst(new PojoBuku("009", "Bumi", "novel", 99000, false));
        rental.addFirst(new PojoBuku("008", "Bulan", "novel", 99000, true));
        rental.add(new PojoBuku("007", "Shingeki No Kyojin Vol. 39", "comic", 50000, false));
        rental.add(new PojoBuku("006", "Poor Dad Rich Dad", "non-fiction", 120000, true));
        rental.add(new PojoBuku("005", "OnePiece", "comic", 50000, false));
        rental.add(new PojoBuku("004", "Sousou No Frieren Vol. 10", "comic", 50000, false));


        // default data barang
        System.out.println("Daftar Barang:");
        iterator = rental.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        
        }
        System.out.println();
        // Edit based on Status
        iterator = rental.listIterator(rental.size()-2);
        while (iterator.hasNext()) {
            PojoBuku buku = iterator.next();
            buku.setStatus(true);
        } 

        System.out.println("Daftar Barang setelah diedit:");
        iterator = rental.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Delete BY ISBN
        iterator = rental.listIterator();
        while (iterator.hasNext()) {
            PojoBuku hi = iterator.next();
            if (hi.getIsbn().equals("006")) {
                iterator.remove();
            }
        }
        
        
        // list after deleting data nomral
        System.out.println("\nList sesudah hapus data: ");
        for (PojoBuku pojoBuku : rental) {
            System.out.println(pojoBuku);
        }


        // print backwards
        iterator = rental.listIterator(rental.size());
        System.out.println("\nCetak mundur list: ");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        

    }
}
