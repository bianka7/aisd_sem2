package lab12;

public class zad03 {
    private static Integer M = 7;
    private static Integer[] vals = new Integer[M];
    private static String[] keys = new String[M];
    
    private static int hash(Integer k) {
        return (11 * k % M);
    }
    
    public Integer get(Integer key) {
        for(int i = hash(key); keys[i] != null; i = (i+1)%M ) {
            if(key.equals(keys[i])) {
                return vals[i];
            }
        }
        return null;
    }
    
    public static void put(String key, Integer value) {
        int keyVal = key.charAt(0);
        int i;
        for(i = hash(keyVal); keys[i] != null; i = (i+1)%M) {
            if(keys[i].equals(key)) {
                break;
            }
        }
        keys[i] = key;
        vals[i] = value;
    }
    
    static void print() {
		for(int i = 0; i < M; i++) {
			if(vals[i] == null) {
				System.out.println(". " );
			}
			else {
			System.out.println("Klucz: " + keys[i] + " Wartość: " + vals[i]);
			}
		}
	}
    
    public static void main(String[] args) {
         String[] klucze = new String[] {"E", "F", "G", "A", "C", "B", "D"};
        // String[] klucze = new String[] {"C", "E", "B", "G", "F", "D", "A"}; 
        // String[] klucze = new String[] {"B", "D", "F", "A", "C", "E", "G"};
        // String[] klucze = new String[] {"C", "G", "B", "A", "D", "E", "F"};
        // String[] klucze = new String[] {"F", "G", "B", "D", "A", "C", "E"};
        // String[] klucze = new String[] {"G", "E", "C", "A", "D", "B", "F"};
        // Czy w każdym przypadku jest możliwe uzyskanie tablicy? tak

        for(int i = 0; i < klucze.length; i++) {
            put(klucze[i], klucze[i].charAt(0) * 10);    
        }
        
        print();
    }
}

