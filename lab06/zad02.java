package lab06;

public class zad02 {

	public static void main(String[] args) {
		StosInteger stos = new StosInteger();
		
		stos.push(2);
		stos.push(4);
		
		System.out.println();
		System.out.print("Stos: ");
		StosInteger.print();
		
		stos.pop();
		System.out.println();
		StosInteger.print();
		

		stos.pop();
		System.out.println();
		StosInteger.print();
		
		stos.push(6);
		stos.push(8);
		System.out.println();
		StosInteger.print();
		
		stos.pop();
		System.out.println();
		StosInteger.print();
		
		stos.push(10);
		System.out.println();
		StosInteger.print();
		
		stos.pop();
		System.out.println();
		StosInteger.print();
		stos.pop();
		System.out.println();
		StosInteger.print();
		
	}
}

