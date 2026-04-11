package SC01;
import java.util.LinkedList;

public class Playlist {
    private String namaPlaylist;
    private LinkedList<String> playlist;

    public Playlist(String nama){
        this.namaPlaylist = nama;
        playlist = new LinkedList<>();
    }


    

    public void tambahLagu(String judul){
        System.out.println("Berhasil menambahkan lagu " + judul + "!");
        playlist.add(judul);
    }

    public void hapusLagu(int no){

        if (no >= 1 && no <= playlist.size()) {
            System.out.println(playlist.get(no - 1) + " dihapus!");
            playlist.remove(no - 1);
        } else if (no >= playlist.size()) {
            System.out.println("Ga ada nomor itu karena lagu cuman ada " + playlist.size());
        } {
            System.out.println("gabisa hapus lagu, tambahin lagu dulu kocak");
        }
    }

    public void menampilkanPlaylist(){
        System.out.println("Playlist " + namaPlaylist);

        int n = 1;
        for (String lagulagu : playlist) {
            System.out.println(n + ". " + lagulagu);
            n++;
        }
    }

    public void cariBasedOnJudul(){

    }

    public void sisipTengahIndexAwal(){

    }

    public void sisipTengahIndexAkhir(){
        
    }

}
