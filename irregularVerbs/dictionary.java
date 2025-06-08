package irregularVerbs;

public class dictionary {
    private Node root;

    public void tambah(String verb){
        kosakata baru = new kosakata(verb);
        root = insert(root, baru);
    }


    private Node insert(Node node, kosakata data) {
        if (node == null) {
            return new Node(data);
        }

        int comparee = data.getVerb().compareTo(node.data.getVerb());
        if (comparee < 0) {
            node.left = insert(node.left, data);
        } else if (comparee > 0) {
            node.right = insert(node.right, data);
        }
        
        return node;
    }


    public boolean check(String verb) {
        return search(verb.toLowerCase(), root);
    }


    public boolean search(String v, Node node){
        if (node == null) return false;

        if (v.equals(node.data.getVerb())) return true;
        
        if (v.compareTo(node.data.getVerb()) < 0) {
            return search(v, node.left);
        } else {
            return search(v, node.right);
        }
    }


    private void inOrder(Node node){
        if (node != null) {
            
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    
    public void printVerbs(){
        System.out.println("Irregular Verbs are..");

        inOrder(root);
        System.out.println();
    }

}
