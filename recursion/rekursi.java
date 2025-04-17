package recursion;

import java.util.Stack;

public class rekursi {
    Stack<Integer> storeNilaiFaktorial = new Stack<>();
    
    public void recursionPush(int n){
        while (n > 0) {
            System.out.println("faktorial " + n + " dijalankan");
            storeNilaiFaktorial.push(n);
            n--;
        }
    }

    public void multiplier(){
        int base = 1;

        while (!storeNilaiFaktorial.empty()) {  
            int nilai = storeNilaiFaktorial.pop();
            System.out.println("base case faktorial: " + nilai);
        }    


    }
}
