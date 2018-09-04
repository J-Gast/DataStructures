package BinaryTree;

public class Tree {

    private Node root;

    /* Constructors */
    public Tree(int valor) {
        this.root = new Node(valor);
    }

    public Tree(Node root) {
        this.root = root;
    }

    /* Setters and Getters */
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private void addNode(Node node, Node root) {
        if(root == null)
            this.setRoot(node);
        else {
            if(node.getValue() <= root.getValue()) {
                if(root.getLeftChild() == null)
                    root.setLeftChild(node);
                else
                    addNode(node, root.getLeftChild());
            }
            else {
                if(root.getRightChild() == null)
                    root.setRightChild(node);
                else
                    addNode(node, root.getRightChild());
            }
        }
    }

    public void addNode(Node node) {
        this.addNode(node, this.root);
    }


}
