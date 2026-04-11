package SC03;
import java.util.LinkedList;
import java.util.ListIterator;

public class Browser {
    private LinkedList<String> history;
    private ListIterator<String> iterator;
    private String activePage;

    public Browser(){
        history = new LinkedList<>();
        iterator = history.listIterator();
    }



    public void visitNewPage(String url){
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        iterator.add(url);
        activePage = url;
        System.out.println("Kamu sedang mengunjungi: " + activePage);
    }

    public void back(){
        if (iterator.hasPrevious()) {
            activePage = iterator.previous();
            System.out.println("back to " + activePage);
        } else {
            System.out.println("udah di halaman paling awal");
        }

    }

    public void maju(){
        if (iterator.hasNext()) {
            activePage = iterator.next();
            System.out.println("maju ke " + activePage);
        } else {
            System.out.println("sudah di halaman paling akhir");
        }
    }

    public void tampilkanHalaman(){
        System.out.println("halaman yang sedang dibuka " + activePage);
    }

}
