public class Node<E> {

    private Node left, right;
    private E data;

    public Node(){
        this.left = null;
        this.right = null;
        this.data = null;
    }


    public Node(E data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}