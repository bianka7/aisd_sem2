package lab06;

public class zad04 {

	public static void main(String[] args) {
		Stos<Integer> wartosci = new Stos<Integer>();
		Stos<Character> operatory = new Stos<Character>();
		
		String wyrazenie = "(2*2)/4)"; // (2 + 3) + 7)
		
		int answer = 0;
		for(int i = 0; i < wyrazenie.length(); i++) {
			char znak = wyrazenie.charAt(i);
			
			if(znak == '+' || znak == '-' || znak == '*' || znak == '/') {
				operatory.push(znak);
			}
			else if(znak>='0' && znak<='9') {
				int n = Integer.parseInt(String.valueOf(znak));  //wartosci.push(znak) nie zadziala, nie dodajemy liczby tylko jej kod
				wartosci.push(n);
			}
			else if(znak == ')'){
				while(operatory.isEmpty() == false ) {
				char x = operatory.pop();
				int liczba1 = wartosci.pop();
				int liczba2 = wartosci.pop();
						
				switch(x){
					case'+':
					answer = liczba1 + liczba2;
					break;
					case'-':
					answer = liczba2 - liczba1;
					break;
					case'*':
					answer = liczba1 * liczba2;
					break;
					case'/':
					answer = liczba2 / liczba1;
					break;
				} 
				wartosci.push(answer); //wynik bedzie na poczatku stosu
				}
			}
		}
		System.out.println(wartosci.pop());
 	} 
}