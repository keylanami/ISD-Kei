import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


// modul
public class queueLL<E> {
    
    private Queue<E> queueList;

    public queueLL(){
        queueList = new LinkedList<>();

    }

    public void enqueue(E object) {
        queueList.add(object);
    }

    public E dequeue() throws NoSuchElementException{
        return queueList.poll();
    }

    public void printQueue() {
        for (E value : queueList){
            System.out.println(value + " ");
        }

        System.out.println();
    }

}
