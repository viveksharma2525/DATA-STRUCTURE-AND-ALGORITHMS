/*
Q: Tree is almost BST. Only two nodes are swapped
   Identify two swapped nodes

   Swap the data and return the bst
*/

class SwapNode{
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
	Node prev = null;
	Node first = null;
	Node second = null;

	public void findSwap(Node root){
		if(root == null){
			return;
		}
		findSwap(root.left);
		if(prev!=null && prev.data > root.data){
			if(first == null){
				first = prev;
				second = root;
			}
			else{
				second = root;
			}
		}
		prev = root;
		findSwap(root.right);
	}

	public void correctBST(Node root){
		findSwap(root);

		if(first!=null && second!=null){
			int temp = first.data;
			first.data = second.data;
			second.data = temp;
		}
	}

	public static void PrintNode(Node root){
		if(root == null){
			return;
		}
		PrintNode(root.left);
		System.out.print(root.data + " ");
		PrintNode(root.right);
	}

	public static void main(String[] args) {
		SwapNode tree = new SwapNode();
		tree.root = new Node(15);

		//LST
		tree.root.left = new Node(10);
		tree.root.right = new Node(13);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(24);
		tree.root.left.left.left = new Node(3);
		tree.root.left.left.right= new Node(8);

		//RST
		tree.root.right = new Node(13);
		tree.root.right.left = new Node(18);
		tree.root.right.right = new Node(35);
		tree.root.right.left.left = new Node(16);
		tree.root.right.left.right = new Node(20);
        tree.root.right.left.right.right = new Node(22);

       System.out.println("The BST Tree is :");
       tree.PrintNode(tree.root);
       System.out.println();

       tree.correctBST(tree.root);

       System.out.println("The Updated BST Tree is:");
       tree.PrintNode(tree.root);
	}
}