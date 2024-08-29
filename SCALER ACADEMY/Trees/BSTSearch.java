class BSTSearch{
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

	public boolean search(Node root, int k){
		Node temp = root;

		while(temp!=null){
			if(temp.data == k){
				return true;
			}
			if (temp.data <k){
				temp = temp.right;
			}
			else{
				temp = temp.left;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		BSTSearch tree = new BSTSearch();

		tree.root =  new Node(4);
		tree.root.left = new Node(0);
		tree.root.left.left = new Node(-1);
		tree.root.left.right = new Node(3);

		tree.root.right = new Node(10);
		tree.root.right.left = new Node(7);
		tree.root.right.left.left = new Node(6);
		tree.root.right.left.right = new Node(9);
		tree.root.right.right = new Node(15);

		int k = 0;
		System.out.println(tree.search(tree.root,k));
	}

}