package lab05;

public class zad05 {

	public static void main(String[] args) {
		Kolejka<Samochod> kolejka = new Kolejka<Samochod>();

		kolejka.Enqueue(new Samochod("DW12", "Porsche", "9:43"));
        kolejka.Enqueue(new Samochod("NO34", "BMW", "9:50"));
        kolejka.Enqueue(new Samochod("NOS56", "Audi", "10:12"));
        kolejka.Enqueue(new Samochod("ERA78", "Mercedes", "10:15"));
        kolejka.Enqueue(new Samochod("KRA90", "Ford", "11:30"));
        
        System.out.println("Samochody w kolejce");
        kolejka.print();
        System.out.println();
        System.out.println("Czasy między przybyciami dwóch kolejnych pojazdów:");
        kolejka.printCzasy();
		
	}
}
class Samochod{
	private String nrRejestracyjny;
	private String marka;
	private String godzPrzybycia;
	
	public Samochod(String nrRejestracyjny, String marka, String godzPrzybycia) {
		this.nrRejestracyjny = nrRejestracyjny;
		this.marka = marka;
		this.godzPrzybycia = godzPrzybycia;
	}
	
	public String printNrRejestracyjny() {
		return nrRejestracyjny;
	}
	public String printMarka() {
		return marka;
	}
	public String printGodzPrzybycia() {
		return godzPrzybycia;
	}
	public String toString() {
        return "Samochod:" + " marka= " + marka + "  ";
    }
}