package SC04;
import java.util.Stack;

public class Parkir {
    private Stack<String> jalurParkir;

    public Parkir(){
        jalurParkir = new Stack<>();
    }



    public void masuk(String plat){
        System.out.println("Mobil plat " + plat + " masuk!");
        jalurParkir.push(plat);
    }

    public void keluar(){
        if (jalurParkir.isEmpty()) {
            System.out.println("parkiran kosong!");
        } else {
            System.out.println(jalurParkir.pop() + " keluar"); 
        }
    }

    public void tampilinSemuaMobilYangParkir(){

        System.out.println("Plat mobil-mobil yang lagi parkir:");
        int a = 1;
        for (String cars : jalurParkir) {
            System.out.println(a + ". " + cars);
            a++;
        }
    }

    public void cekYangKeluarBerikutnya(){

        if (jalurParkir.isEmpty()) {
            System.out.println("Parkiran kosong!");
        } else {
            System.out.println("Yang keluar berikutnya adalah: " + jalurParkir.peek());
        }
    }

}
