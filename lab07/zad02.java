package lab07;

public class zad02 {
	public static void main(String[] args) {
		Stos<Float> wartosci = new Stos<Float>();

		String wyrazenie = "2 3 74 + *";
		String[] wyrazenieONP = wyrazenie.split(" ");
		
		float answer = 0;
		for(int i = 0; i < wyrazenieONP.length; i++) {
			String y = wyrazenieONP[i];
			
			if(y.matches("[0-9]*")) {
				wartosci.push(Float.parseFloat(wyrazenieONP[i]));
			}
			else {
				float x1 = wartosci.pop();
				float x2 = wartosci.pop();
				
				switch(wyrazenieONP[i]){
					case"+":
					answer = x1+x2;
					break;
					case"-":
					answer = x2 - x1;
					break;
					case"*":
					answer = x1*x2;
					break;
					case"/":
					answer = x2/x1;
					break;
				} 
				wartosci.push(answer);
				
			}
		}
		
		System.out.print(answer);
	}
}
