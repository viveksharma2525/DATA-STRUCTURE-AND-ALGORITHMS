class InorderPredecessor {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    /* Function to traverse a binary tree without recursion and without stack */
    void MorrisTraversal(Node root) {
        Node current, pre;

        if (root == null)
            return;

        current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right;
            } else {
                pre = current.left;
                while (pre.right != null && pre.right != current)
                    pre = pre.right;

                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                } else {
                    pre.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        InorderPredecessor tree = new InorderPredecessor();

        // Construct the tree
        tree.root = new Node(6);
        tree.root.right = new Node(8);
        tree.root.right.right = new Node(29);
        tree.root.right.right.left = new Node(20);
        tree.root.right.right.left.left = new Node(15);
        tree.root.right.right.left.left.left = new Node(9);
        tree.root.right.right.left.left.left.right = new Node(10);
        tree.root.right.right.left.left.right = new Node(17);
        tree.root.right.right.left.left.right.right = new Node(19);
        tree.root.right.right.left.right = new Node(23);
        tree.root.right.right.left.right.right = new Node(25);

        // Right Subtree
        tree.root.right.right.right = new Node(32);
        tree.root.right.right.right.left = new Node(30);
        tree.root.right.right.right.right = new Node(35);
        tree.root.right.right.right.right.left = new Node(33);
        tree.root.right.right.right.right.right = new Node(39);

        // Perform in-order traversal
        tree.MorrisTraversal(tree.root);
    }
}
