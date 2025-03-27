public class JurnalNode {
    public Object data;
    public JurnalNode next;

    public JurnalNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public JurnalNode() {
        this(null);
    }

}