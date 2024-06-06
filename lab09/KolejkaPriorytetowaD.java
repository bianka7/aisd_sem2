package lab09;
import java.util.GregorianCalendar;

public class KolejkaPriorytetowaD {
    
    private Node first; //pierwszy element 
    private int n; //ilosc elementow
    
    private static class Node { 
        Pacjent pacjent;
        Node next;
        
        Node(Pacjent p) {
            pacjent = p;
            next = null;
        }
    }
    
    private static class Pacjent implements Comparable<Pacjent> {
        String imie;
        String nazwisko;
        GregorianCalendar data;
        
        Pacjent(String im, String naz, GregorianCalendar d) {
            imie = im;
            nazwisko = naz;
            data = d;
        }
        
        public int compareTo(Pacjent p) {
            return data.compareTo(p.data);
        }
        
        public String toString() {
            return imie + " " + nazwisko + " " + data.getTime().toString();
        }
    }
    
    public KolejkaPriorytetowaD() {
        first = null;
        n = 0;
    }
    
    public void insert(Pacjent p) {
        Node nowy = new Node(p);
        if (first == null || p.compareTo(first.pacjent) < 0) {
        	nowy.next = first;
            first = nowy;
        } 
        else {
            Node teraz = first;
            while (teraz .next != null && p.compareTo(teraz .next.pacjent) > 0) {
            	teraz  = teraz .next;
        }
        nowy.next = teraz .next;
        teraz .next = nowy;
      }
        n++;
   }
    
    public Pacjent delMax() {
        if (isEmpty()) return null;
        Pacjent max = first.pacjent;
        first = first.next;
        n--;
        return max;
    }
    
    public boolean isEmpty() {
        return n == 0;
    }
    
    public void print() {
        Node teraz = first;
        while (teraz != null) {
            System.out.println(teraz.pacjent);
            teraz = teraz.next;
        }
    }
    
    public static void main(String[] args) {
        KolejkaPriorytetowaD kolejka = new KolejkaPriorytetowaD();
        
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
