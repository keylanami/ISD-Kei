package sll;

public class main {

    public static void main(String[] args) {
        listgudang menu = new listgudang();

        menu.add(new gudang("ayam geprek", 10000, 50));
        menu.add(new gudang("ayam madu", 15000, 20));
        menu.add(new gudang("ayam cripsy", 12000, 25));
        menu.add(new gudang("ayam sambal matah", 15000, 30));
        menu.add(new gudang("ayam pedas", 17000, 22));
        menu.print();
        System.out.println();

        menu.removeBarang("ayam sambal matah");
        menu.removeFirst(null);
        menu.print();

    }
}