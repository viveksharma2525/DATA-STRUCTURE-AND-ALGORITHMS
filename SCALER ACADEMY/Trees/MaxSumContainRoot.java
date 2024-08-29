/*
Q: Max Sum Containing Root Node
*/
class MaxSumContainRoot{
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
    int Sum = Integer.MIN_VALUE;
	public int MaxPath(Node root){
		if (root == null) {
			return 0;
		}
		int left = MaxPath(root.left);
		int right = MaxPath(root.right);

		left = Math.max(left,0);
		right = Math.max(right ,0);


		int maxWithAny = root.data + left + right ;

		// Update the Sum
		Sum = Math.max(Sum,maxWithAny);
        
        return root.data + Math.max(left,right);
	}
	public static void main(String[] args) {
		MaxSumContainRoot tree = new  MaxSumContainRoot();

		tree.root = new Node(4);
		tree.root.left = new Node(3);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(-1);
		tree.root.left.right.left = new Node(5);
		tree.root.right.left = new Node(3);
		tree.root.right.left.left = new Node(2);
		tree.root.right.left.right = new Node(-3);
		
		tree.MaxPath(tree.root);
		System.out.println(tree.Sum);

	}
}