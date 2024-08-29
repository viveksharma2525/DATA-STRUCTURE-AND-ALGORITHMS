class TreeArrayImplement{
	private int[] tree;
	private int size;

	public TreeArrayImplement(int capacity){
		tree = new int[capacity];
		size = 0;
	}

	public void add(int value){
		if (size == tree.length) {
			System.out.println("Tree is Full");
			return;
		}
		tree[size++] = value;
	}
	public int getLeftChild(int index){
		int leftChildIndex = 2*index+1;
		if (leftChildIndex >= size) {
			return -1;
		}
		return tree[leftChildIndex];
	}
	public int getRightChild(int index){
		int rightChildIndex = 2*index+2;
		if (rightChildIndex >= size) {
			return -1;
		}
		return tree[rightChildIndex];
	}
	public int getParent(int index){
		if (index == 0) {
			return -1;
		}
		return tree[(index - 1)/2];
	}
	public static void main(String[] args) {
		TreeArrayImplement tree = new TreeArrayImplement(10);

		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(6);
		tree.add(7);
		tree.add(8);
		tree.add(0);

		System.out.println("Root : " + tree.tree[0]);
		System.out.println("Left Child Of Root : " + tree.getLeftChild(0));
		System.out.println("Right Child Of Root : " + tree.getRightChild(0));
		System.out.println("Parent of Node 4 : " + tree.getParent(3));
	}
}