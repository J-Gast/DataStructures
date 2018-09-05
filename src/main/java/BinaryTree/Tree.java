package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    private Node root;

    public Tree(int valor) {
        this.root = new Node(valor);
    }

    public Tree(Node root) {
        this.root = root;
    }

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

    public Queue<Node> preOrder(Node root) {
        return preOrder(root, new LinkedList<Node>());
    }

    private Queue<Node> preOrder(Node root, Queue<Node> queue){
        queue.add(root);

        if(root.getLeftChild() != null)
            inOrder(root.getLeftChild(), queue);
        if (root.getRightChild() != null)
            inOrder(root.getRightChild(), queue);

        return queue;
    }

    public Queue<Node> inOrder(Node root) {
        return inOrder(root, new LinkedList<Node>());
    }

    private Queue<Node> inOrder(Node root, Queue<Node> queue) {
        if(root.getLeftChild() != null)
            inOrder(root.getLeftChild(), queue);

        queue.add(root);

        if (root.getRightChild() != null)
            inOrder(root.getRightChild(), queue);

        return queue;
    }

    public Queue<Node> postOrder(Node root) {
        return postOrder(root, new LinkedList<Node>());
    }

    private Queue<Node> postOrder(Node root, Queue<Node> queue) {
        if(root.getLeftChild() != null)
            postOrder(root.getLeftChild(), queue);
        if (root.getRightChild() != null)
            postOrder(root.getRightChild(), queue);

        queue.add(root);

        return queue;
    }
}
