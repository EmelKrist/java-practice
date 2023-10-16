package easy;

public class FirstDepthSearch {
    private static class Node {
        int data;
        Node left, right;
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void traverseInorder(Node node) {
        if (node != null) {
            traverseInorder(node.left);
            System.out.println(node.data);
            traverseInorder(node.right);
        }
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        traverseInorder(tree); // Inorder traversal: 4 2 5 1 3
    }
}
