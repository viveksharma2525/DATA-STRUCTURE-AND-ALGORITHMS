import java.util.Queue;
import java.util.LinkedList;
class LeftView{
	static class Node{
		int data;
		Node left;
		Node right;

		public Node(int x){
			this.data = x;
			left = null;
			right =null;
		}
	}

	Node root;
	public void  Traversing(Node root){
		Queue<Node> q = new LinkedList<>();

		// To enqueue in Queue
		q.add(root);
		q.add(null);

		Node prev = null;

		while(q.size()>1){
			Node temp = q.peek();
			q.remove();

			// to make a boundary so that we know level is done
			if(temp == null){
				System.out.println("\n");
				q.add(null);
			}
			else {
				if(prev == null){
					System.out.println(temp.data);
				}
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
			}
			prev = temp;
		}
	}

	public static void main(String[] args) {
		LeftView tree = new LeftView();
		tree.root = new Node(3);
		tree.root.left = new Node(7);
		tree.root.right = new Node(4);
		tree.root.left.left = new Node(9);
		tree.root.left.left.left= new Node(12);
		tree.root.left.left.right= new Node(19);
		tree.root.right.left = new Node(14);
		tree.root.right.right = new Node(18);
		tree.root.right.left.left = new Node(15);
		tree.root.right.left.right = new Node(1);
		tree.root.right.left.left.left = new Node(21);
		tree.root.right.left.left.right = new Node(2);
		tree.root.right.left.right.right = new Node(6);
		tree.root.right.right.right = new Node(5);


        System.out.println("Level Order Traversing:");
		tree.Traversing(tree.root);
	}
}