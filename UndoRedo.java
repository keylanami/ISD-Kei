import java.util.ListIterator;
import java.util.Stack;

public class UndoRedo<E> {
    private Stack<E> undo;
    private Stack<E> redo;

    public UndoRedo() {
        this.undo = new Stack<>();
        this.redo = new Stack<>();
    }


    // nambahin data ke ctrl z
    public void addData(E data) {
        undo.push(data); 
        redo.clear(); //clear biar ini tetep kosong
    }

    // mekanisme undo
    public void undoData(){
        if (undo.isEmpty()) {
            System.out.println("ga ada yg km ctrl z");
        } else {
            E value = (E) undo.pop(); 
            redo.push(value);
        }
    }

    // habis di-undo, harus bisa di-redo
    public void redo(){
        if (redo.isEmpty()) {
            System.out.println("belum apa-apain redo");
        } else {
            E value = (E) redo.pop();
            undo.push(value);
        }
    }

    public void viewUndo() {
        ListIterator iterator = undo.listIterator(undo.size());
        while (iterator.hasPrevious()) {
            Object value = iterator.previous();
            System.out.println(value);
        }
    }

    public void viewRedo() {
        ListIterator iterator = redo.listIterator(redo.size());
        while (iterator.hasPrevious()) {
            Object value = iterator.previous();
            System.out.println(value);
        }
    }

    
}
