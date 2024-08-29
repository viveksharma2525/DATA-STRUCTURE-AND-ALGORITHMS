class MaxPathSum{
	static class Node{
		Node left;
		Node right;
		int data;

		public Node(int x){
			this.data = x;
			left = null;
			right = null;
		}
	}
	Node root;

	int MaxPath_Sum = Integer.MIN_VALUE;

	public int MaxPath(Node root){
		if (root == null) {
			return 0;
		}
		int l = MaxPath(root.left);
		int r = MaxPath(root.right);

		l = Math.max(l, 0);
        r = Math.max(r, 0);

        int maxWithRoot = root.data + l + r;

        MaxPath_Sum = Math.max(MaxPath_Sum, maxWithRoot);

        return root.data + Math.max(l, r);
	}
	public static void main(String[] args) {
		MaxPathSum tree = new MaxPathSum();

		tree.root = new Node(4);
		tree.root.left = new Node(-8);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(1);
		tree.root.left.right.left = new Node(15);

		tree.root.right = new Node(-3);
		tree.root.right.left = new Node(2);
		tree.root.right.right = new Node(-6);
		tree.root.right.right.left = new Node(1);

        tree.MaxPath(tree.root);

        System.out.println(tree.MaxPath_Sum);
	}
}