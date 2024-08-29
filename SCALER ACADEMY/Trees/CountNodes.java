/*
Q: Count all nodes which are at distance K from the Roots
(Spin off questions)
*/
class CountNodes{
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
	//Recursive Approach to solve the problem
	public int Count(Node root, int k){
		if(root == null){
			return 0;
		}
		if(k == 0){
			return 1;
		} 
		int x = Count(root.left,k-1);
		int y = Count(root.right,k-1);

		return x+y;
	}
	public static void main(String[] args) {
		CountNodes tree = new CountNodes();

		tree.root = new Node(6);
        tree.root.right = new Node(8);
        tree.root.right.right = new Node(29);
        tree.root.right.right.left = new Node(20);
        tree.root.right.right.left.left = new Node(15);
        tree.root.right.right.left.left.left = new Node(9);
        tree.root.right.right.left.left.left.right = new Node(10);
        tree.root.right.right.left.left.right = new Node(17);
        tree.root.right.right.left.left.right.right = new Node(19);
        tree.root.right.right.left.right = new Node(23);
        tree.root.right.right.left.right.right = new Node(25);

        // RST
        tree.root.right.right.right = new Node(32);
        tree.root.right.right.right.left = new Node(30);
        tree.root.right.right.right.right = new Node(35);
        tree.root.right.right.right.right.left = new Node(33);
        tree.root.right.right.right.right.right = new Node(39);

        int k = 4;

        int result = tree.Count(tree.root,k);
        System.out.println("The Total Number of Nodes:"+ result);
	}
}