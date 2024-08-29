/*
Q:Find the max sum path starting from the root
*/
class MaxSumPath{
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
	public int MaxPath(Node root){
		if (root == null) {
			return 0;
		}
		int l = MaxPath(root.left);
		int r = MaxPath(root.right);

		int max = Math.max(l,r);
		int res = root.data + Math.max(max,0);

		return res;
	}
	public static void main(String[] args) {
		MaxSumPath tree = new MaxSumPath();

		tree.root = new Node(7);
		tree.root.left = new Node(2);
		tree.root.right = new Node(-3);
		tree.root.left.left = new Node(-5);
		tree.root.left.right = new Node(-4);
		tree.root.left.right.left = new Node(3);

		tree.root.right.right = new Node(8);

		System.out.println(tree.MaxPath(tree.root));
	}
}