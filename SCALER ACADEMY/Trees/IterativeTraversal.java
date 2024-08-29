import java.util.Stack;
class IterativeTraversal{
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
	
	public void Traveral(){
		Node current = root;
        Stack<Node> st = new Stack<>();

        if (root == null) {
        	return;
        }
		while(!st.empty() || current!=null){
			while(current!=null){
				st.push(current);
				current = current.left;
			}
			current = st.peek();
			System.out.print(current.data + " -> ");
			st.pop();
			current = current.right;
		}
	}
	public static void main(String[] args) {
		IterativeTraversal tree = new IterativeTraversal();

		tree.root = new Node(3);
		tree.root.left = new Node(7);
		tree.root.left.left = new Node(9);
		tree.root.left.left.left = new Node(12);
		tree.root.left.left.right = new Node(19);

		tree.root.right = new Node(4);
		tree.root.right.left = new Node(14);
		tree.root.right.right = new Node(18);
		tree.root.right.left.left = new Node(15);
		tree.root.right.left.right = new Node(-12);
		tree.root.right.left.right.right = new Node(6);

		tree.Traveral();
	}
}