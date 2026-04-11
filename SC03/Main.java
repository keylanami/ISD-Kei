package SC03;
public class Main {
    public static void main(String[] args) {
        Browser gugel = new Browser();

        gugel.visitNewPage("gogoanime.id/shigatsu/episode1");
        gugel.visitNewPage("gogoanime.id/shigatsu/episode10");
        gugel.visitNewPage("gogoanime.id/shigatsu/episode11");
        gugel.visitNewPage("gogoanime.id/shigatsu/episode21");
        
        gugel.tampilkanHalaman();
        
        gugel.visitNewPage("gogoanime.id/shigatsu/episodeOva");

        gugel.back();
        gugel.back();

        gugel.maju();

        gugel.back();
        gugel.back();






    }
}
