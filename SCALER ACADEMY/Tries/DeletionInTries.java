
import java.util.HashMap;
class DeletionInTries{
	static class Node{
		boolean isEnd;
		HashMap<Character, Node>children;

		public Node(){
			children = new HashMap<>();
			isEnd = true;
		}
	}
	Node root;
	public DeletionInTries(){
		root = new Node();
	}
	public void insert(Node root, String word){
		Node current = root;
		int l = word.length();

		for (int i = 0;i<l ;i++ ) {
			char ch =  word.charAt(i);

			if (!current.children.containsKey(ch)) {
				current.children.put(ch, new Node());
			}
			current = current.children.get(ch);
		}
		current.isEnd = true;
	}
	public void delete(String word) {
        delete(root, word, 0);
    }
	private void delete(Node current, String word, int index) {
        if (index == word.length()) {
            if (current.isEnd) {
                current.isEnd = false;
            }
            return;
        }

        char ch = word.charAt(index);
        Node node = current.children.get(ch);
        if (node == null) {
            return;
        }

        delete(node, word, index + 1);

        if (!node.isEnd && node.children.isEmpty()) {
            current.children.remove(ch);
        }
    }
    public boolean Search(Node root, String word) {
        Node current = root;
        int l = word.length();

        for (int i = 0; i < l; i++) {
            char ch = word.charAt(i);
            if (!current.children.containsKey(ch)) {
                return false;
            }
            current = current.children.get(ch);
        }
        return current.isEnd;
    }
    public static void main(String[] args) {
    	DeletionInTries tries = new DeletionInTries();

    	tries.insert(tries.root, "Vivek");
    	tries.insert(tries.root, "Lakshay");
    	tries.insert(tries.root, "Bhardwaj");

    	boolean result = tries.Search(tries.root, "Vivek");

    	System.out.println("Word Vivek Found : " + result);

    	tries.delete("Vivek");

    	
    	boolean res = tries.Search(tries.root, "Vivek" );

    	System.out.println("Word Vivek Found : " + res);
    }

}