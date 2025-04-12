package TipeE;

public class main {
    public static void main(String[] args) {
        backforth gugel = new backforth();
        
        gugel.addURL("https://genshin.hoyoverse.com/en/");
        gugel.addURL("https://github.com/keylanami/ISD-Kei");
        gugel.addURL("https://www.hoyolab.com/home");
        gugel.addURL("https://langeek.co/en/grammar/course/976/within");


        gugel.back();
        gugel.forth();
        gugel.back();
        gugel.history();

    }
    

}
