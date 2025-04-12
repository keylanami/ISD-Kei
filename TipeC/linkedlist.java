package TipeC;

public class linkedlist {
    private node head;

    public void addMemb(member name){
        node pendatang = new node(name);
    
        if (head == null) {
            head = pendatang;
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = pendatang;
        }
    }
    

    public void delete(String name){
        if (head == null) return; 

        if (head.data.getNama().equals(name)) {
            head = head.next;
            return;
        }
        
        node current = head;
        while (current.next != null){
            current.next = current.next.next;
        }
    }

    public void search(String name){
        node current = head;

        while (current!= null) {
            if (current.data.getNama().equalsIgnoreCase(name)) {
                System.out.println(current.data);
            }

            current = current.next;
        }
    }

    public void print(){
        node current = head;

        while (current != null) {
            System.out.println(current.data + "\n");
            current = current.next;
        }
    }


    public void period(int tahun){
        node current = head;

        while (current!= null) {
            if (current.data.getLamaJadiMember() > tahun) {
                System.out.println(current.data);
            }

        current = current.next;
        }

    }

}
