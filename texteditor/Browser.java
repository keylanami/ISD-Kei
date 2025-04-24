package texteditor;

import java.util.Stack;

public class Browser {
    Stack<String> mundurStack = new Stack<>();
    Stack<String> historyStack = new Stack<>();
    String current; // kita lagi ada di website ini loh

   

    public void mulai(){
    current = "utama";
    System.out.println("Aplikasi dijalankan\nAnda berada di halaman " + current);
    }

    public void maju(String a){

        if (!a.equals(current)) {
            mundurStack.push(current);
            current = a;
            System.out.println("Maju ke halaman " + current + "\n");

        } else {
            System.out.println("Tidak bisa maju ke halaman yang sama" + "\n");

        }
    }

    public void mundur(){

        if (!mundurStack.empty()) {
            if (!historyStack.contains(current)) { //biar ga duplikat
                historyStack.push(current);
            }.
            System.out.println("Keluar dari halaman " + current);

        
            current = mundurStack.pop();
            System.out.println("Mundur ke halaman " + current + "\n");

        } else if (mundurStack.isEmpty()) {
            current = "Utama";
            System.out.println("Mundur ke halaman utama" + "\n");

        } else if (mundurStack.isEmpty() && current.equals("Utama")) {
            System.out.println("Keluar dari aplikasi" + "\n");
        }{

        }

    }

    public void seeHistory(){
        for(String pages : historyStack){
            System.out.println("- " + pages + "\n");
        }
        
    }
}
