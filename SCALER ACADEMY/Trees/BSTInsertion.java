class BSTInsertion{
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

	public void insertion(int k){
    Node newNode = new Node(k);
		if(root == null){
			root = newNode;
			return;
		}

		Node temp = root;
		Node prev = null;

		while(temp!= null){
			prev =  temp;
			if(temp.data == k){
				return ;
			}
			else if(temp.data < k){
				temp = temp.right;
			}
			else{
				temp = temp.left;
			}
		}
		
		if(k < prev.data){
			prev.left = newNode;
		}
		else{
			prev.right =newNode;
		}
	}
	public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
	public static void main(String[] args) {
		BSTInsertion tree = new BSTInsertion();

		tree.root =  new Node(4);
		tree.root.left = new Node(0);
		tree.root.left.left = new Node(-1);
		tree.root.left.right = new Node(3);

		tree.root.right = new Node(10);
		tree.root.right.left = new Node(7);
		tree.root.right.left.left = new Node(6);
		tree.root.right.left.right = new Node(9);
		tree.root.right.right = new Node(15);

		int k = 17;

		tree.insertion(k);

		tree.inOrderTraversal(tree.root);
	}
}