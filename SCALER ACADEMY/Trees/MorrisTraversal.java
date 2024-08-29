class MorrisTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int x) {
            this.data = x;
            left = null;
            right = null;
        }
    }

    Node root;

    public void Inorder(Node root) {
        Node curr = root;
        Node temp;

        while (curr != null) {
            if (curr.left == null) {
                System.out.println(curr.data);
                curr = curr.right;
            } else {
                temp = curr.left;
                while (temp.right != null && temp.right != curr) {
                    temp = temp.right;
                }
                if (temp.right == null) {
                    temp.right = curr;
                    curr = curr.left;
                } else {
                    temp.right = null;
                    System.out.println(curr.data);
                    curr = curr.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        MorrisTraversal tree = new  MorrisTraversal();

        // LST
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

        // RST
        tree.root.right.right.right = new Node(32);
        tree.root.right.right.right.left = new Node(30);
        tree.root.right.right.right.right = new Node(35);
        tree.root.right.right.right.right.left = new Node(33);
        tree.root.right.right.right.right.right = new Node(39);

        tree.Inorder(tree.root);
    }
}
