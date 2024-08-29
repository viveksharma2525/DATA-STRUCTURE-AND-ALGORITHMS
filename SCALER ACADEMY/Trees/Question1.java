/* Calculate the size of a tree = Total number of node*/
class Question1{
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

	public int size(Node root){
		if(root == null){
		  return 0;
		}
		int ls = size(root.left);
		int rs = size(root.right);

		return ls+rs+1;
	}
	public static void main(String[] args) {
		Question1 tree = new Question1();

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

        int result = tree.size(tree.root);

		System.out.println("Binary Tree:" + "" + result);
	}
}