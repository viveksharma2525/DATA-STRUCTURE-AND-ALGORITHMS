class LongPath{
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
	int daimeter = 0;
	public int Height(Node root){
		if (root == null) {
			return 0;
		}
		int LH = Height(root.left);
		int RH = Height(root.right);
		daimeter = Math.max(daimeter, LH + RH + 1);

		return Math.max(LH, RH) + 1;
	}
	 
	public static void main(String[] args) {
		LongPath tree = new LongPath();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(4);

		tree.Height(tree.root);

        System.out.println(tree.daimeter);

	}
}