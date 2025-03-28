public class JurnalMainHash {
    
    public static void main(String[] args) {
        JurnalHashSet players = new JurnalHashSet(5);


        // ISI 5 PEMAIN UTAMA DLU
        players.add("Himmel");
        players.add("Eren Yaeger");
        players.add("Kinich");
        players.add("Kaedehara Kazuha");
        players.add("Mark Lee");

        // lebih dari 5 berarti cadangan
        players.add("Zhanghao");
        players.add("Sunghoon");

        players.printAll();
        System.out.println();
        
        players.printStatus();

    }
}
