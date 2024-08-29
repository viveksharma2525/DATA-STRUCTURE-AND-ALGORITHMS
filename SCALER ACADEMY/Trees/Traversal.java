import java.util.*;
class Traversal{
	static class Node{
		int data;
		Node left;
		Node right;

		public Node(int x){
			left = null;
			data = x;
			right = null;
		}
	}

	Node root;

	//inorder
	public void inorder(Node root){
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	//preorder
	public void preorder(Node root){
		if(root == null){
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}

	//postorder
	public void postorder(Node root){
		if(root == null){
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
    public static void main(String[] args) {
		Traversal tree = new Traversal();

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

		System.out.println("Binary Tree:");
		tree.postorder(tree.root);
	}
}