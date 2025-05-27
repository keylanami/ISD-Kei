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
        inorderHelper(root);
    }

        private void inorderHelper(TreeNode<E> node) {
            if (node == null) 
                return;

            inorderHelper(node.getLeftNode());
            System.out.printf("%s ", node.getData());
            inorderHelper(node.getRightNode());
    }

    public void searchBST(E key){
        boolean result = searchBSThelper(root, key);

        if (result) {
            System.out.println("Data found: " + key);
        } else {
            System.out.println("Data not found");
        }
        
    }


    public boolean searchBSThelper(TreeNode<E> node, E key){
        if(node == null)
        return false;

        if (key.equals(node.getData()))
        return true;

        if (key.compareTo(node.getData()) < 0) {
            return searchBSThelper(node.getLeftNode(), key);
        } else {
            return searchBSThelper(node.getRightNode(), key);
        }

    }

    public E findMin(){
        if (root == null)
        return null;

        return minHelper(root);
    }

        private E minHelper(TreeNode<E> node){
        if (node.getLeftNode() == null) {
            return node.getData();
        }

        return minHelper(node.getLeftNode());
        }


    public E findMax(){
        if (root == null) return null;
        return maxHelper(root);
    }

        private E maxHelper(TreeNode<E> node){
            if (node.getRightNode() == null) {
                return node.getData();
            }

            return maxHelper(node.getRightNode());
        }

    public int height(){
        return heightHelper(root);
    }

    private int heightHelper(TreeNode<E> node){
        if (node == null) return 0;

        int leftHeight = heightHelper(node.getLeftNode());
        int rightHeight = heightHelper(node.getRightNode());

        return 1 + Math.max(leftHeight, rightHeight);

    }

}
