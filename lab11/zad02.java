package lab11;

public class zad02 {
public Node root;
	
	private class Node{
		private Float key;
		private Node left,right;
		private Integer value;
		
		 public Node(Float l) {
			 key = l;
			 value = 1;
		 } 
	}
	
	public void put(Float key) {
		root = put(root, key);
	}
	
	private Node put(Node x, Float  key) {
		if(x==null) {
			return new Node(key);
		}
		
		int cmp = key.compareTo(x.key);
		
		if(cmp < 0) {
			x.left = put(x.left, key);
		}
		else if(cmp > 0) {
			x.right = put(x.right, key);
		}
		else {
			x.value++;
		}
			return x;
	}
	
	public Float max() {
        return max(root).key;
    }

    private Node max(Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }
    }
	
    public int niezdane() {
        return niezdane(root);
    }

    private int niezdane(Node x) {
        if (x == null) {
            return 0;
        }
        if (x.key == 2f) {
            return x.value;
        }
        int lewo = niezdane(x.left);
        int prawo = niezdane(x.right);
        if (x.key < 2f) {
            return lewo + x.value + prawo;
        }
        return lewo + prawo;
    }
	
    public Float najczestsze() {
        return najczestsze(root).key;
    }

    private Node najczestsze(Node x) {
        if (x == null) {
            return null;
        }
        Node max = x;
        Node maxlewo = najczestsze(x.left);
        Node maxprawo = najczestsze(x.right);

        if (maxlewo != null && maxlewo.value > max.value) {
        	max = maxlewo;
        }
        if (maxprawo != null && maxprawo.value > max.value) {
        	max = maxprawo;
        }

        return max;
    }
    
    public void podniesOcene() {
        podniesOcene(root);
    }

    private void podniesOcene(Node x) {
        if (x != null) {
            podniesOcene(x.left);
            if (x.key == 4.5f) {
                x.key = 5f;
            }
            podniesOcene(x.right);
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
		zad02 oceny1 = new zad02();
		float[] oceny = {2.5f, 3, 5, 4.5f, 3.5f, 4, 3.5f, 5, 4.5f, 2, 2};
		
		for(int i = 0; i < oceny.length; i++) {
			oceny1.put(oceny[i]);
		}

		oceny1.print(oceny1.root);
		System.out.println();
		
		System.out.println("a) Najwyższa ocena: " + oceny1.max());
		
		System.out.println("b) Ile osób nie zdało: " + oceny1.niezdane());

		System.out.println("c) Jakich ocen jest najwięcej: " + oceny1.najczestsze());
		
		oceny1.podniesOcene();
		System.out.println("d) Osobom, które uzykały ocene 4.5 podnieś do 5");
		oceny1.print(oceny1.root);
		
	}
}