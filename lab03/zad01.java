package lab03;

public class zad01 {
	private static class Student{
				int nrAlbumu; 
				String nazwisko; 
				String imie;
				Student(int nA, String nz, String im){
					nrAlbumu = nA;
					nazwisko = nz;
					imie = im;
				}
				public String toString() {
					return nrAlbumu + " " + nazwisko + " " + imie;
				}
			}
	
	public static void main(String[] args) {
		Student[] tab = new Student[3];
		Student s0 = new Student(213231, "nazwisko1", "imie1");
		Student s1 = new Student(213773, "krysiak", "bianka");
		Student s2 = new Student(384329, "nazwisko2", "imie2");
		tab[0] = s0;
		tab[1] = s1;
		tab[2] = s2;
		
		for(int i = 0; i < tab.length; i++) {    //bez String toString() nie zadziala
 			System.out.println(tab[i]);
		}
		
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i].nazwisko + " ");
		}
	}
}
