class PopulatePointer{
	static class Node{
		Node left;
		Node right;
		Node next;
		int data;

		public Node(int x){
			this.data = x;
			left = null;
			right = null;
			next = null;
		}
	}
	Node root;
	public void RightPointer(Node root){
		Node current = root;
		while(current!=null){
			if (root == null) {
			    return;
		    }
		    Node temp = current;

		    while(temp!=null){
			    if (temp.left!=null) {
			    	temp.left.next = temp.right;
			    }
			    if (temp.right != null && temp.next!=null){
				    temp.right.next = temp.next.left;
			    }
			    temp = temp.next;
		    }
		    current = current.left;
	    }
	} 
	public static void main(String[] args) {
		PopulatePointer tree = new PopulatePointer();

		tree.root =  new Node(3);
		tree.root.left = new Node(7);
		tree.root.left.left = new Node(10);
		tree.root.left.right = new Node(-8);
		tree.root.left.left.left = new Node(4);
		tree.root.left.left.right = new Node(9);
		tree.root.left.right.left = new Node(2);
		tree.root.left.right.right = new Node(5);
		

		tree.root.right = new Node(12);
		tree.root.right.left = new Node(14);
		tree.root.right.right = new Node(16);
		tree.root.right.left.left = new Node(20);
		tree.root.right.left.right = new Node(25);
		tree.root.right.right.left = new Node(45);
		tree.root.right.right.right = new Node(56);

		tree.RightPointer(tree.root);

		int a = tree.root.next!=null?tree.root.next.data:-1;
		int b = tree.root.left.next!=null?tree.root.left.next.data:-1;
		int c = tree.root.right.next!=null?tree.root.right.next.data:-1;
		int d = tree.root.left.left.next!=null?tree.root.left.left.next.data:-1;
		int e = tree.root.right.right.next!=null?tree.root.right.right.next.data:-1;

		// Check the code now
		System.out.println("Following are populated nextRight pointers in" + " the tree(-1 is printed if there is no nextRight)");

		System.out.println("nextRight of " + tree.root.data + " is " + a);
		System.out.println("nextRight of " + tree.root.left.data + " is " + b);
		System.out.println("nextRight of " + tree.root.right.data + " is " + c);
		System.out.println("nextRight of " + tree.root.left.left.data + " is " + d);
		System.out.println("nextRight of " + tree.root.right.right.data + " is " + e);
		
	}
}