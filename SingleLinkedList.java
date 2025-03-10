import java.util.NoSuchElementException;

//ORIGINALLY CODED BY KEYLA NAMIRA JOHAN 607062400065 D3IF-48-02
public class SingleLinkedList<E> {
    private ListNode<E> first;
    private ListNode<E> last;
    private String name;
    
    
    public SingleLinkedList(){
        this("menu");
    }
    
        public SingleLinkedList(String listName) {
           name = listName;
           first = last = null;
        }

        private boolean isEmpty(){
            return first == null;
        }
        
        public void print(){
            if (isEmpty()) {
                System.out.printf("Empty %s%n", name);
                return;
            }

            System.out.printf("The %s is: %n", name);
            ListNode<E> current = first;

            while (current!= null) {
                System.out.printf("%s", current.data);
                current = current.next;
            }
            System.out.println();
        }



// divider

        public void insertFront(E insertItem){
            ListNode baru = new ListNode<E>(insertItem);

            if (isEmpty()) {
                first = last = new ListNode<E>(insertItem);
            } else {
                baru.next = first;
                first = baru;
            }
        }


        public void insertBack(E insertItem){
            ListNode baru = new ListNode<E>(insertItem);

            if (isEmpty()) {
                first = last = new ListNode<E>(insertItem);
            } else {
                last.next = baru;
                last = baru;
            }
        }


        public E removeFront() throws NoSuchElementException{

            if (isEmpty()) {
                throw new NoSuchElementException(name + " is empty");
            }

            E removed = first.data;
            if (first == last) {
                first = last = null;
            } else {
                first = first.next;
            }

            return removed;
        }



        public E removeBack() throws NoSuchElementException{

            if (isEmpty()) {
             throw new NoSuchElementException(name + " is empty");
            }

            E removedItem = last.data;
            if (first == last) {
                first = last = null;

            } else {
                ListNode<E> current = first;
                while (current.next!= last) {
                    current = current.next;
                }
                last = current;
                current.next = null;
            } 

            return removedItem;
        }



        public void search(String name){
            if (isEmpty()) {
                System.out.println("Menu is currently UNAVAILABLE");
                return;
            }

            ListNode<E> current = first;
            while (current!=null) {
                if (current.data instanceof PojoResep) {
                    PojoResep resep = (PojoResep) current.data;

                    if (resep.getFoodName().equalsIgnoreCase(name)) {
                        System.out.println("Here you go!\n" + resep);
                        return;
                    }
                }
                
                current = current.next;
            }
            System.out.println("About " + name + ".. Sorry we lost it.");
        }

}