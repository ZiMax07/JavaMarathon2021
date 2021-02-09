package day18;

public class Node {

    private int node;
    private Node left;
    private Node right;

    public Node(int node) {
        this.node = node;
    }

    public int getNode() {
        return node;
    }
    public void setNode(int node) {
        this.node = node;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }

    public static void addNode(int insertValue, Node root){
        if (root == null)
            throw  new IllegalArgumentException("Узел не должен быть null");

        Node nextNode = root;
        Node current = null;

        while (nextNode != null){
            current = nextNode;
            if (insertValue < current.getNode()){
                nextNode = current.getLeft();
            } else {
                nextNode = current.getRight();
            }
        }
        if (insertValue < current.getNode()){
            current.setLeft(new Node(insertValue));
        } else {
            current.setRight(new Node(insertValue));
        }
    }

    public static void dfs(Node node){
        if(node == null)
            return;

        dfs(node.getLeft());
        System.out.print(node.getNode() + " ");
        dfs(node.getRight());
    }
}
