public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    public Tree(){
        root = null;
    }

    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }
    
    public void inorderTrav() {
        
    }

        private void inorderHelper(TreeNode<E> node) {
            if (node == null) 
                return;

            inorderHelper(node.getLeftNode());
            System.out.printf("%s ", node.getData());
            inorderHelper(node.getRightNode());
    }

    public boolean searchBST(TreeNode<E> node, E key){
        if(node == null)
        return false;

        if (key.equals(node.getData()))
        return true;

        if (key.compareTo(node.getData()) < 0) {
            return searchBST(node.getLeftNode(), key);
        } else {
            return searchBST(node.getRightNode(), key);
        }

    }

}
