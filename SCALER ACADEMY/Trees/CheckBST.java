class CheckBST{
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
	// Approach 3: check the range of the Node
	public boolean isBST(Node root,int l,int r){
		if(root == null){
			return true;
		}
		if(l<=(root.data) && (root.data)<=r){
			boolean x = isBST(root.left,l,root.data-1);
			boolean y = isBST(root.right,root.data+1,r);

			return x && y;
		}
		return false;
	}
	public static void main(String[] args) {

		CheckBST tree =  new CheckBST();
		
		tree.root =  new Node(4);
		tree.root.left = new Node(0);
		tree.root.left.left = new Node(-1);
		tree.root.left.right = new Node(3);

		tree.root.right = new Node(10);
		tree.root.right.left = new Node(7);
		tree.root.right.left.left = new Node(6);
		tree.root.right.left.right = new Node(9);
		tree.root.right.right = new Node(15);

		int l = Integer.MIN_VALUE;
		int r = Integer.MAX_VALUE;

		if(tree.isBST(tree.root,l,r)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}