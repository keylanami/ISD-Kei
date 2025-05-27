import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> pohon = new Tree<>();
        int[] val = {111, 90, 150, 80, 100, 130, 170, 95, 140};

        System.out.println("Inorder traversal");
        for (int i : val) {
            System.out.printf("%d ", i);
            
        }
    }
}
