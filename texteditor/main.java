package texteditor;

public class main {
    public static void main(String[] args) {
        
        Browser simulasi = new Browser();

        simulasi.mulai();
        System.out.println();

        simulasi.maju("Detail");
        simulasi.maju("Favorit");
        
        
        simulasi.mundur(); 
        simulasi.maju("Detail");
        simulasi.maju("Favorit");


        System.out.println();
        simulasi.mundur();
        simulasi.mundur();
        simulasi.mundur();

        simulasi.seeHistory();
    }
}
