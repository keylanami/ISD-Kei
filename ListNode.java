//ORIGINALLY CODED BY KEYLA NAMIRA JOHAN 607062400065 D3IF-48-02

public class ListNode<E> {
    E data;
    ListNode<E> next;

    public ListNode(E object){
        data = object;
        this.next = null;
    }

    public E getData() {
        return data;
    }
    
} 