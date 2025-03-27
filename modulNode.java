
public class modulNode {

    public Object data; // nampung data yang bakal dimasukkin ke hash table
    public modulNode next;  // buat iterator

    public modulNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public modulNode() {
        this(null);
    }

}
