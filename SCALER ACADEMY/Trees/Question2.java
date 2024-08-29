/*Height of a tree
Height(root) = max(height(lst)+height(rst))+1*/
class Question2{
	static class Node{
		int data;
		Node left;
		Node right;

		public Node(int x){
			data = x;
			left = null;
			right = null;
		}
    }
	
	Node root;

	public int height(Node root){
		if (root == null) {
			return -1;
		}
		int hl = height(root.left);
		int hr = height(root.right);

		return Math.max(hl,hr)+1;
	}
	public static void main(String[] args) {
		Question2 tree = new Question2();

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

        int result = tree.height(tree.root);

		System.out.println("Binary Tree:" + "" + result);
	}
}