class Width{
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
	public int Daimeter(Node root){
		if (root == null) {
			return -1;
		}
		int l = Daimeter(root.left);
		int r = Daimeter(root.right);
		daimeter = Math.max(daimeter,(l+r+2));

		return Math.max(l,r)+1;
	}
	public static void main(String[] args) {
		Width tree = new Width();
		tree.root = new Node(3);
		//LST
		tree.root.left = new Node(7);
		//RST
		tree.root.right = new Node(9);
		//lst of RST
		tree.root.right.left = new Node(6);
		tree.root.right.left.left = new Node(18);
        tree.root.right.left.left.left = new Node(33);
        tree.root.right.left.left.left.left = new Node(41);
        tree.root.right.left.left.right = new Node(12);
        tree.root.right.left.left.right.left = new Node(19);
        tree.root.right.left.left.right.left = new Node(17);
        tree.root.right.left.right = new Node(14);
        tree.root.right.left.right.right = new Node(25);
        tree.root.right.left.right.right.right = new Node(24);

        tree.root.right.right = new Node(4);
        tree.root.right.right.right = new Node(-3);
        tree.root.right.right.right.right = new Node(22);
        tree.root.right.right.right.right.right = new Node(26);

        System.out.println(tree.Daimeter(tree.root));

	}
}