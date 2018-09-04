package BinaryTree;

public class Main {
    public static void main(String[] args) {
        Node node = new Node(10);
        Tree tree = new Tree(node);

        Node node1 = new Node(5);
        tree.addNode(node1);

        Node node2 = new Node(2);
        tree.addNode(node2);

        Node node3 = new Node(7);
        tree.addNode(node3);

        System.out.println(node1.getRightChild().getValue());
    }
}
