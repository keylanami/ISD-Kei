package sll;

public class listgudang {
    private node head;  // bikin variable head dari tipe data node

    public listgudang(){
        head = null;
        // ini null buat ngasih tanda kalo headnya memang null, belum diisi
    }


  public void add(gudang data){
    node newnode = new node(data);

    if (head == null) {
        head = newnode;

    } else {
        node pointer = head;

        while (pointer.next!= null) {
            pointer = pointer.next;
        }

        pointer.next = newnode;

    }
  }

  public void removeFirst(String data){


    //ini remove first
    if (head.data.getBarang().equals(data)) {
        head = head.next;
        System.out.println(data + " dihapus");
        return;
    }

  }

  public void removeBarang(String dataBarang){
    node current = head;

    while (current.next!= null & !current.next.data.getBarang().equals(dataBarang)) {
        current = current.next;
    }

    if (current.next == null) {
        System.out.println(" gak ketemu"); 

    } else {
        current.next = current.next.next;
        System.out.println(dataBarang + " dihapus");
    }
  }
    

  public void print(){
    node current = head;

    while (current!= null) {
        System.out.println(current.data);
        current = current.next;
    }
  }

}