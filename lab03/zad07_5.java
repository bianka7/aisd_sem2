package lab03;
import java.util.Random;

public class zad07_5 {
	private static class Node{
		int number;
		Node next;
		
		Node(int nb){
			number = nb;
		}
	}
	public static void main(String[] args) {
        Random random = new Random();
        int x;
        Node first = null;
        Node last = null;

        for (int i = 0; i < 20; i++) {
            x = random.nextInt(990) + 10;
            Node temp = new Node(x);
            temp.next = null;
            if (first == null) { 
                first = temp; //pierwszy i ostatni element ustawia na wezel temp
                last = temp;
                last.next = first; //ustawia ostatni element, pole next, na pierwszy element tworząc cykl
            } else { //jezeli lista nie jest pusta
            	last.next = temp;  
            	temp.next = first; // tworzy cykl
                last = temp; //last wskazuje na nowy ostatni element listy
            }
        }
        
        System.out.print("Lista: ");
        Node z = first; 
        	do{
            System.out.print(z.number + " ");
            z = z.next;
        	}while(z != first);
         System.out.println();
        //do while zeby petla wykonala sie napewno 1 raz
         
      //a) wstaw liczbe 1000 przed pierwsza liczba 3 cyfrowa
         Node poprzedni = null;
         Node teraz = first;
        
         
         if(first.number >= 100) { //jezeli 1000 jest pierwsza liczba
        	 Node tysiac = new Node(1000);
        	    tysiac.next = first;
        	    while (teraz.next != first) {
        	        teraz = teraz.next;
        	    }
        	    teraz.next = tysiac;
        	    first = tysiac;
        	}
         else { //jezeli 1000 nie jest pierwsza liczba
         while (teraz != null) {
             if (teraz.number >= 100) {
                 Node tysiac = new Node(1000);
                 tysiac.next = teraz; 
                 if (poprzedni != null) { 
                     poprzedni.next = tysiac; 
                 } else {
                     first = tysiac;
                 }
                 break;
             }
             poprzedni = teraz;
             if(teraz.next != first) {
            	 teraz = teraz.next;
             }
             else {
            	 break;
             	}
         	}
         }
         System.out.print("Liczba 1000 przed pierwsza liczba 3 cyfrowa: ");
         z = first;

         do{
        	 System.out.print(z.number + " ");
        	 z = z.next;
         }while(z != first);
         System.out.println();

        
		//b) usun pierwszy i ostatni element z listy

    	first = first.next; //usuniecie pierwszego elementu
    	last.next = first;
    	
        if (first != null) {
        	Node poprzednie = null; 
            teraz = first;
            while (teraz.next != first) {
            	poprzednie = teraz;
                teraz = teraz.next;
               }
            if (poprzednie != null) {
                poprzednie.next = first;
                last = poprzednie;
               }
            }
        System.out.print("Usunięcie pierwszego i ostatniego elementu: ");		
        z = first;
        do{
       	 System.out.print(z.number + " ");
       	 z = z.next;
        }while(z != first);
        System.out.println();

        
	
	}
}
