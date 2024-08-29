import java.util.HashMap;

class InsertTries {
    static class Node {
        boolean isEnd;
        HashMap<Character, Node> children;

        public Node() {
            children = new HashMap<>();
            isEnd = false;
        }
    }

    Node root;

    public InsertTries() {
        root = new Node();
    }

    public void insert(Node root, String word) {
        Node current = root;
        int l = word.length();

        for (int i = 0; i < l; i++) {
            char ch = word.charAt(i);
            if (!current.children.containsKey(ch)) {
                current.children.put(ch, new Node());
            }
            current = current.children.get(ch);
        }
        current.isEnd = true;
    }

    public static void main(String[] args) {
        InsertTries tries = new InsertTries();
        tries.insert(tries.root, "apple");
       
    }
}
