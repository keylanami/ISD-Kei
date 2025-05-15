import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {
    private Node<E> root;

    public BinaryTree(){
        this.root = null;
    }

    public void insert(E data){
        Node<E> newNode = new Node<>(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node<E>> queue= new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<E> pointer = queue.poll();

            if (pointer.getLeft() == null) {
                pointer.setLeft(newNode);
                break;
            } else {
                queue.add(pointer.getLeft());
            }

            if (pointer.getRight() == null) {
                pointer.setRight(newNode);
                break;
            } else {
                queue.add(pointer.getRight());
            }
            
        }
    }

    public void inorder(){
        inorder(root);
        System.out.println();
    }

    public void inorder(Node<E> node){
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getData() + " ");
            inorder(node.getRight());
        }
    }

    public void preorder(){
        preorder(root);
        System.out.println();
    }

    public void preorder(Node<E> node){
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public void postorder(){
        postorder(root);
        System.out.println();
    }

    public void postorder(Node<E> node){
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public void levelOrder(){
        if (root == null) return;

        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<E> pointer = queue.poll();
            System.out.print(pointer.getData() + " ");

            if (pointer.getLeft() != null)
            queue.add(pointer.getLeft());

            if (pointer.getRight() != null)
            queue.add(pointer.getRight());
        }

        System.out.println();
    }

    public int countNodes(){
        return countNodes(root);
    }

    private int countNodes(Node<E> node) {
        if (node == null) return 0;
        return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
    }


    public boolean search(E value){
        return search(root, value);
    }

    private boolean search(Node<E> node, E value){
        if (node == null) return false;
        if (node.getData().equals(value)) return true;
        return search(node.getLeft(), value) || search(node.getRight(), value);
    }

    public int depth(){
        return depth(root);
    }

    public int depth(Node<E> node){
        if (node == null) return 0;
        int leftDepth = depth(node.getLeft());
        int rightDepth = depth(node.getRight());

        return 1 + Math.max(leftDepth, rightDepth);
    }
}