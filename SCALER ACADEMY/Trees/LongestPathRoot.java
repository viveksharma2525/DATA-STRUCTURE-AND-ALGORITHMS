/*
Q:Find the Longest Path Across the Root
*/
class LongestPathRoot{
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
	public int Height(Node root){
		if(root == null){
			return -1;
		}
		int l = Height(root.left);
		int r = Height(root.right);

		return l+r+2;
	}
	public static void main(String[] args) {
		LongestPathRoot tree = new LongestPathRoot();

        // LST
		tree.root = new Node(11);
		tree.root.left = new Node(6);
		tree.root.right = new Node(15);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(9);
		tree.root.left.right.left = new Node(13);

		//RST
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(21);
		tree.root.right.right.left = new Node(18);
		tree.root.right.right.left.left = new Node(16);

		System.out.println(tree.Height(tree.root));

	}
}