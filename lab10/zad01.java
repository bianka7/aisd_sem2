package lab10;

public class zad01 {

    public Node root;

    private class Node {
        private String key;
        private Node left, right;
        private Integer value;

        public Node(String l) {
            key = l;
            value = 1;
        }
    }

    public void put(String key) {
        root = put(root, key);
    }

    private Node put(Node x, String key) {
        if (x == null) {
            return new Node(key);
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = put(x.left, key);
        } else if (cmp > 0) {
            x.right = put(x.right, key);
        } else {
            x.value++;
        }
        return x;
    }

    public Integer get(String key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else {
                return x.value;
            }
        }
        return null;
    }

    public void delete(String key) {
        root = delete(root, key);
    }

    private Node delete(Node x, String key) {
        if (x == null) return null;

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete(x.left, key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            if (x.right == null) return x.left;
            if (x.left == null) return x.right;

            Node t = x;
            x = deleteMin(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        return x;
    }

    private Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        return x;
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return size(x.left) + size(x.right) + 1;
    }

    void print(Node root)  //in order
    {
        if (root != null) {
            if (root.left != null) {
                print(root.left);
            }
            System.out.print(root.key + " ");
            if (root.right != null) {
                print(root.right);
            }
        }
    }

    public static void main(String[] args) {
        String x = "T E S T D R Z E W B S T";
        String[] znaki = x.split(" ");

        zad01 bst = new zad01();

        System.out.print("a) Tworzenie drzewa: ");
        for (int i = 0; i < znaki.length; i++) {
            bst.put(znaki[i]);
        }

        bst.print(bst.root);

        System.out.println();
        System.out.print("b) Ile razy wystepuje T i G: ");
        Integer y = bst.get("T");
        Integer z = bst.get("G");
        System.out.print(y + " ");
        System.out.print(z);

        System.out.println();

        System.out.print("c) Usuwanie najwcześniejszego R: ");
        bst.delete("R");
        bst.print(bst.root);
        System.out.println();

        System.out.print("d) Dodanie K ktore wystepuje 4 razy: ");
        for (int i = 0; i < 4; i++) {
            bst.put("K");
        }
        bst.print(bst.root);
        System.out.println();

        System.out.print("e) Usuniecie najwczesniejszej litery z alfabetu: ");
        bst.deleteMin();
        bst.print(bst.root);
        System.out.println();
    }
}
