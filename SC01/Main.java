package SC01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Playlist setLagu = new Playlist("Biola Kaori");

        setLagu.tambahLagu("Caprice in A minor OP.1 No.5");
        setLagu.tambahLagu("Violin Sonata No.9 in A major OP.47");
        setLagu.tambahLagu("Introduction and Rondo Capriciosso");
        
        System.out.println();
        setLagu.menampilkanPlaylist();
        
        System.out.println();
        setLagu.tambahLagu("Violin Sonata No.5");

        System.out.println();
        setLagu.menampilkanPlaylist();

        setLagu.hapusLagu(3);
        System.out.println();

        setLagu.menampilkanPlaylist();

        
    }
}
