package tries;

public class basics {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr != null && curr.eow;
    }

    public static void main(String[] args) {

        String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        for (String key : keys) {
            insert(key);
        }
        System.out.println(search("the")); // true
        System.out.println(search("these")); // false


        // Trie trie = new Trie();
        // trie.insert("apple");
        // System.out.println(trie.search("apple")); // true
        // System.out.println(trie.search("app")); // false
        // System.out.println(trie.startsWith("app")); // true
        // trie.insert("app");
        // System.out.println(trie.search("app")); // true
    }    
}
