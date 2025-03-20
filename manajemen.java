import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class manajemen<E> {
    private Queue<E> antrian;

    public manajemen(){
        antrian = new LinkedList<>();
    }


    public void enqueue(E object) {
        antrian.add(object);
    }

    public E dequeue() throws NoSuchElementException {
       return antrian.poll();
    }

    public void adaBerapa(){
        System.out.print(antrian.size());
    }

    public void printQueue(){
        for (E value : antrian) {
            System.out.println(value + " ");
        }

        System.out.println();
    }

    
}
