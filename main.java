public class main {
    
    public static void main(String[] args) {
        System.out.println("asds");
        BinaryTree<Character> tree = new BinaryTree<>();

        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        tree.insert('F');
        tree.insert('G');
        tree.insert('H');
        tree.insert('I');
        tree.insert('J');
        tree.insert('K');
        tree.insert('L');

        System.out.println("Inorder Traversal:");
        tree.inorder();
        System.out.println();

        System.out.println("Post Order Traversal:");
        tree.postorder();
        System.out.println();

        System.out.println("Pre Order Traversal:");
        tree.preorder();
        System.out.println();

        System.out.println("Level Order Traversal:");
        tree.levelOrder();
        System.out.println();

        System.out.print("total nodes: " + tree.countNodes());
        System.out.println();

        System.out.print("apa ada huruf A? " + tree.search('A'));
        System.out.println();

        System.out.print("Kedalaman tree: " + tree.depth());
        System.out.println();
        
    }
}
