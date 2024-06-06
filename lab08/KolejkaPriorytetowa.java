package lab08;
import java.util.GregorianCalendar;

public class KolejkaPriorytetowa {
    
    private Pacjent[] rq; //kopiec w postaci tablicy
    private int n;
    
    public static class Pacjent implements Comparable<Pacjent> {
            String imie = null;
            String nazwisko = null;
            GregorianCalendar data = null;
            
            //konstruktor klasy Pacjent
            Pacjent(String im, String naz, GregorianCalendar d){
                imie = im;
                nazwisko = naz;
                data = d;
            }
            
            //compareTo()
            public int compareTo(Pacjent p) {
                return data.compareTo(p.data);
            }
            public String toString() {
                return imie + " " + nazwisko + " " + data.getTime().toString();
            }
    }   
    
    public KolejkaPriorytetowa(int capacity) {
        rq = new Pacjent[capacity+1]; 
        n = 0;
    }
    
    private void swap(int i, int j) { 
        Pacjent temp = rq[i];
        rq[i] = rq[j];
        rq[j] = temp;
    }
    
    private void swim(int k) 
    {
        while (k > 1 && (rq[k/2].compareTo(rq[k])>0) ){ // && (rq[k/2].compareTo(rq[k])>0) 
            swap(k, k/2);
            k = k/2;
        }  
    }  
    
    private void sink(int k) { 
        while (2*k <= n)
        {
            int j = 2*k;
            if (j < n && less(j, j+1)) j++;
            if (!less(k, j)) break;
            swap(k, j);
            k = j;
        }

    }
    
    void insert(Pacjent p) {
    	n++;
    	rq[n] = p; //kolejnosc w insert
        swim(n);
    }
    
    private boolean less(int i, int j) {
        return rq[i].compareTo(rq[j]) > 0;
    }
    
    public Pacjent delMax(){ 
        Pacjent max = rq[1];
        swap(1, n--);
        sink(1);
        rq[n+1] = null;
        return max;
    }
    
    public void print() {
        for (int i = 1; i <= n; i++) {
            if (rq[i] != null) {
                System.out.println(rq[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        KolejkaPriorytetowa kolejka = new KolejkaPriorytetowa(8);
        
        kolejka.insert(new Pacjent("Jan", "Kowalski", new GregorianCalendar(1961, 9, 20)));
        kolejka.insert(new Pacjent("Tamara", "Bykowska", new GregorianCalendar(1929, 1, 10)));
        kolejka.insert(new Pacjent("Marian", "Baranowski", new GregorianCalendar(1958, 12, 5)));
        kolejka.insert(new Pacjent("Katarzyna", "Makowska", new GregorianCalendar(1972, 5, 7)));
        kolejka.insert(new Pacjent("Joanna", "Groth", new GregorianCalendar(1942, 7, 15)));
        kolejka.insert(new Pacjent("Monika", "Włodarska", new GregorianCalendar(1964, 2, 27)));
        kolejka.insert(new Pacjent("Kazimierz", "Nowakowski", new GregorianCalendar(1937, 3, 21)));
        kolejka.insert(new Pacjent("Waldemar", "Chamerski", new GregorianCalendar(1978, 11, 11)));
        
        kolejka.print();   
        kolejka.delMax();
        System.out.println();
        
        kolejka.print();
        kolejka.delMax();
        System.out.println();
        
        kolejka.print();
        kolejka.delMax();
        System.out.println();
        
        kolejka.insert(new Pacjent("Anna", "Maliszewska", new GregorianCalendar(1981, 8, 3)));
        kolejka.print();
        System.out.println();
    }
}
