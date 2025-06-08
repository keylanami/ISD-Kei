package irregularVerbs;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        dictionary kamus = new dictionary();

        int choose;
        
        do {

            System.out.println("Pilih Menu Input Kosakata");
            System.out.println("1. Input Verb Irregular");
            System.out.println("2. Cari Kata");
            System.out.println("3. Tampil Isi Kamus");
            System.out.println("4. Keluar\n");

            System.out.println("Choose!");
            choose = hi.nextInt();
            hi.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Irregular Verb");
                    String newVocab = hi.nextLine();
                    kamus.tambah(newVocab);
                    System.out.println();
                    break;
            
                case 2:
                    System.out.println("What verb are you searching for?");
                    String searchVocab = hi.nextLine();
                    
                    if (kamus.check(searchVocab)) {
                        System.out.println("'" + searchVocab + "'" + " is irregular verb\n");
                    } else {
                        System.out.println("'" + searchVocab + "'" + " isnt irregular verbs\n");
                    }
                    break;

                case 3:
                    kamus.printVerbs();
                    System.out.println();
                    break;
                default:
                    break;
            }

        } while (choose != 4);
        
    
    }
}
