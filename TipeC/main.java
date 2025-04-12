package TipeC;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        linkedlist memblaundry = new linkedlist();
        Scanner hi = new Scanner(System.in);

        memblaundry.addMemb(new member("kei", 0001, "tralala", "Gold", 5));
        memblaundry.addMemb(new member("markie", 0010, "tralele", "Platinum", 10));
        memblaundry.addMemb(new member("haechi", 0027, "trralelo", "Silver", 9));

        System.out.println("list member laundry xiangling: ");
        memblaundry.print();

        
        System.out.println("final boss males nyuci");
        memblaundry.period(10);
        
        memblaundry.print();

        System.out.println("pilih: \n1. cari orang \n2. hapus nama");
        int pilih = hi.nextInt();

        
        System.out.println("cari siapa: ");
        String orang = hi.nextLine();
        memblaundry.search(orang);
            
        System.out.println("hapuskan tentangku dari list\n mark/ haechan/ kei");
        String villain = hi.nextLine();
        memblaundry.delete(villain);
        
        

        System.out.println("current list ada: ");
        memblaundry.print();

    }
}
