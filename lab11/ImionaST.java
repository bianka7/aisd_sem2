package lab11;

public class ImionaST {

	public Node root;
	
	private class Node{
		private String key;
		private Node left,right;
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
	        if (x == null) return new Node(key);
	        int cmp = key.compareTo(x.key);
	        if (cmp < 0) x.left = put(x.left, key);
	        else if (cmp > 0) x.right = put(x.right, key);
	        else x.value++;
	        return x;
	    }
	
	int size() {
		return size(root);
	}
	
	int size(Node x) {
		if(x==null) {
			return 0;
		}
		else {
			return(size(x.left)+1+size(x.right));
		}
	}
	
	public void delete(String key) {
		root = delete(root, key);
	}
	
	public Node delete(Node x, String key) {
	    if (x == null) {
	        return null;
	    }
	    int cmp = key.compareTo(String.valueOf(x.key.charAt(0)));
	    if (cmp < 0) {
	        x.left = delete(x.left, key);
	    } else if (cmp > 0) {
	        x.right = delete(x.right, key);
	    } else {
	        if (x.right == null) {
	            return x.left;
	        }
	        if (x.left == null) {
	            return x.right;
	        }
	        Node t = x;
	        x = min(t.right);
	        x.right = deleteMin(t.right);
	        x.left = t.left;
	    }
	    return x;
	}
	
	public void deleteMin() {
		root = deleteMin(root);
	}
	
	private Node deleteMin(Node x) {
		if(x.left == null) {
			return x.right;
		}
		x.left = deleteMin(x.left);
		return x;
	}
	
	public String min() {
		return min(root).key;
	}
	
	private Node min(Node x) {
		if(x.left==null) {
			return x;
		}
		else {
			return min(x.left);
		}
	}
	
	void print(Node root) {
	    if (root != null) {
	        print(root.left);
	        System.out.print(root.key + " ");
	        print(root.right);
	    }
	}
	
	public static void main(String[] args) {
		String[] imiona = new String[] {"Jan", "Vadzim", "Bianka", "Karol", "Dawid", "Kuba", "Maciej", "Karol", "Tomek"};
		ImionaST bst = new ImionaST();
		
		for(int i = 0; i < imiona.length; i++) {
			bst.put(imiona[i]);
		}
		System.out.print("Kopiec: ");
		bst.print(bst.root);
		
		System.out.println();
		System.out.print("a) Ile jest imion reprezentowanych: ");
		System.out.print(bst.size());
		
		System.out.println();
		System.out.print("b) Imie zaczynające sie na najwczesniejsza litere w alfabecie: ");
		String y = bst.min();
		System.out.println(y);
		
		System.out.print("c) Usunięcie imion rozpoczynających się od litery T: ");
		System.out.println();
		bst.delete("T");
		bst.print(bst.root);
		System.out.println();
		System.out.print("Rozmiar po usunieciu: " + bst.size());
	}

}
