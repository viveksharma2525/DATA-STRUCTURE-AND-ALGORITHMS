/*
Search if K element exists in your Tree
if yes return 3

Learn: class and instance of a tree in a oops
so in when call search we use instance of a tree in a dsa
*/
class Question3{
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
	int k = 17;

	public boolean search(Node root, int k){
		if (root == null) {
			return false;
		}
		if (root.data == k){
			return true;
		}
		boolean l = search(root.left,k);
		boolean r = search(root.right,k);

		return l||r;
	}
	public static void main(String[] args) {
		Question3 tree = new Question3();

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

		int k = 4;

		if (tree.search(tree.root,k)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}	
	}
}