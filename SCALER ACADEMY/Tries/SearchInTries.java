import java.util.HashMap;

class SearchInTries {
    static class Node {
        boolean isEnd;
        HashMap<Character, Node> children;

        public Node() {
            children = new HashMap<>();
            isEnd = false;
        }
    }

    Node root;

    public SearchInTries() {
        root = new Node();
    }
    public void insert(Node root, String word){
        Node current = root;
        int l = word.length();
        for (int i =0 ;i<l ;i++ ) {
            char ch = word.charAt(i);
            if (!current.children.containsKey(ch)) {
                current.children.put(ch, new Node());
            }
            current = current.children.get(ch);
        }
        current.isEnd = true;
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
        SearchInTries tries = new SearchInTries();

        tries.insert(tries.root, "Vivek");

        boolean result = tries.Search(tries.root , "Vivek");
        System.out.println("Word 'Vivek' found: " + result);
    }
}
