// fully annotated by Keyla Namira Johan 607062400065 D3IF-48-02


public class modulHashSet {
    //menampung hash table

    // 1. create variable
    private modulNode[] buckets; // penampung hash table
    private int size; // saves jumlah elemen di hash table

    // 2. create parametered constructor
    public modulHashSet(int bucketsLength) {
        buckets = new modulNode[bucketsLength]; // array named 'buckets' 
        size = 0;
    }
    
    // 3. create default constructor, basically set the default value
    public modulHashSet(){
        this(10);
    } 

    // 4. create Node.java

    // 5. create method hash
    public int hash(Object x) {
        int h = x.hashCode(); // dapetin hashcode dari si x
        if (h < 0) h = -h; // dimutlakkin
            return h% buckets.length; //mastiin result hashcode masuk ke index array
    }

    // 6. create method contains. check apakah object udah ada di dalam
    public boolean contains(Object x) {
        modulNode iterator = buckets[hash(x)];

        while (iterator != null) {
            if (iterator.data.equals(x)) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    // 7. create method size, jumlah element pada set
    public int size(){
        return size;
    }

    //8. create method add
    public boolean add(Object x){
        int h = hash(x); // ngitung index
        modulNode iterator = buckets[h]; // ambil bucket sesuai index


        // checks if x udah ada di dalam set
        if (iterator != null) {
            if (contains(x)) { // kalo tenyata ada
                return false; // false biar gak duplicated
            }
        }

        // lanjut ke sini berarti belum ada apa2
        // tambahin x as node baru
        modulNode newNode = new modulNode(x);
        newNode.next = buckets[h];
        buckets[h] = newNode; // head b, tbtb e indexnya sama, e jadi head, b jadi next
        size++; // nambahin jumlah element dalam set
        
        return true;
    }


    // 9. create method remove
    public boolean remove(Object x){
        modulNode iterator = buckets[hash(x)]; 
        modulNode previous = null;

        // loop nyari x di dalem bucket ini
        while (iterator != null) {
            if (iterator.data.equals(x)) { // kalo nemu sama code line yang ini

                // ngehapus
                if (previous == null) { 
                    buckets[hash(x)] = iterator.next; //  hapus head

                } else {
                    previous.next = iterator.next; // hapus mid or tail
                }
                
                size--; // ngurangin ukuran hashset
                return true;
            }

            previous = iterator; // update 
            iterator = iterator.next; // ngelanjutin iteration
        }

        return false; // x ga ada di dalam hashset, ga ada yg dihapus
    }

    // 10. create method print
    public void print(){

        // looping semua index di dalem buckets
        for(int i = 0; i < buckets.length; i++){
            modulNode iterator = buckets[i]; // ngambil 1st elemen di buckets[i]

            if (iterator != null) { // kalo i gak kosng, print
                System.out.printf("index %d : ", i);

                while (iterator != null) { // as long as iterator gak null, 
                    System.out.println(iterator.data + " "); // cetak data
                    iterator = iterator.next;
                }

                System.out.println();
            }
        }
    }
}
