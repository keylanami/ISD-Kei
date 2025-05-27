public class Main {
    public static void main(String[] args) {
        Tree<Integer> pohon = new Tree<>();
        int[] val = {111, 90, 150, 80, 100, 130, 170, 95, 140};

        System.out.println("Inorder traversal");
        for (int i : val) {
            pohon.insertNode(i);
        }
        pohon.inorderTrav();

        System.out.println();
        System.out.print("Nilai terkecil: " + pohon.findMin() + "\n");
        
        System.out.print("Nilai terbesar: " + pohon.findMax() + "\n" );
        
        System.out.println();
        System.out.print("Tinggi pohon: " + pohon.height() + "\n");
        
        pohon.inorderTrav();
        System.out.println();
        
        System.out.println();
        System.out.println("Mencari data: ");
        pohon.searchBST(80);
        pohon.searchBST(100);
        pohon.searchBST(120);
        
        
    
        
    }
}
