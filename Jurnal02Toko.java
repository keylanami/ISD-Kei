import java.util.ArrayList;
import java.util.Collections;

public class Jurnal02Toko<E extends Comparable<? super E>>{
    private final ArrayList<E> list;

    public Jurnal02Toko(int capacity){
        int initCapacity = capacity > 0? capacity:0;
        list = new ArrayList<>(initCapacity);
    }


   
    public void addData(E values) {
        if (!list.contains(values)) {
            list.add(values);
        } else {
            System.out.println("Error, Kode produk sudah terisi");
        }
    }
    

    public void display(){
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }
        
    public void displaySort(){
        Collections.sort(list);
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }

    public void removeData(E entry){
        list.remove(entry);
    }

    public void setData(E object1, E object2){
        int index = list.indexOf(object1);
        list.add(index, object2);
    }
}
