class MaxOfTree{
	static class Node{
		int data;
		Node left;
		Node right;

		public Node(int x){
			this.data = x;
			left = null;
			right = null;
		}
	}

	Node root;
	public int  Max(Node root){
		if(root == null){
			return Integer.MIN_VALUE;
		}
		int res = root.data;
		int ml = Max(root.left);
		int mr = Max(root.right);

		if(ml > mr){
			res = ml;
		}
		if(mr > ml){
			res = mr;
		}
		return res;
	}
	public static void main(String[] args) {
		MaxOfTree tree = new MaxOfTree();

		tree.root = new Node(7);
		tree.root.left = new Node(8);
		tree.root.right = new Node(11);
		tree.root.left.left = new Node(9);
		tree.root.left.right = new Node(15);

		tree.root.left.right.left= new Node(19);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(16);
		tree.root.right.right.left= new Node(20);
		tree.root.right.right.right= new Node(17);

		int ans = tree.Max(tree.root);	

		System.out.println("Maximum of a Given Tree is : \n"+ ans);
	}
}