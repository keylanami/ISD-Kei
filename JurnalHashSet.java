public class JurnalHashSet {
    
    private JurnalNode[] buckets;
    private int size;

    public JurnalHashSet(int bucketsLength) {
        buckets = new JurnalNode[bucketsLength];
        size = 0;
    }

    public JurnalHashSet(){
        this(5);
    }

    public int hash(Object x) {
        int h = x.hashCode(); 
        if (h < 0) h = -h;
            return h% buckets.length; 
    }

    public boolean contains(Object x) {
        JurnalNode iterator = buckets[hash(x)];

        while (iterator != null) {
            if (iterator.data.equals(x)) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public boolean add(Object x){
        int h = hash(x);
        JurnalNode iterator = buckets[h]; 

        if (iterator != null) {
            if (contains(x)) { 
                return false;
            }
        }

        JurnalNode newNode = new JurnalNode(x);
        newNode.next = buckets[h];
        buckets[h] = newNode;
        size++;
        
        return true;
    }

    public boolean remove(Object x){
        JurnalNode iterator = buckets[hash(x)]; 
        JurnalNode previous = null;

        while (iterator != null) {
            if (iterator.data.equals(x)) { 
                if (previous == null) { 
                    buckets[hash(x)] = iterator.next;

                } else {
                    previous.next = iterator.next;
                }
                
                size--; 
                return true;
            }

            previous = iterator;
            iterator = iterator.next;
        }

        return false;
       }


    public void printAll(){
    System.out.println("All players: ");

    for (JurnalNode allPlayers : buckets) {
        if (allPlayers != null) {
        JurnalNode iterator = allPlayers;

            while (iterator != null) {
                System.out.println(iterator.data);
                iterator = iterator.next;
            }

        }
    }
    }


    public void printStatus(){
    System.out.println("Main Players: ");
    int count = 0;


        for(int i = 0; i < buckets.length; i++){
        JurnalNode iterator = buckets[i];
        

            while (iterator != null) {
                if (count < 5) {
                    System.out.println("- " + iterator.data + " ");
                }
                iterator = iterator.next;
                count++;
            }
        }
        
        System.out.println();

    System.out.println("Sub-players: ");
    count = 0;

         for(int i = 0; i < buckets.length; i++){
        JurnalNode iterator = buckets[i];

        while (iterator != null) {
            if (count >= 5) {
                System.out.println("- " + iterator.data + " ");
            }

            iterator = iterator.next;
            count++;
        }
    }
    }

    

}


    
