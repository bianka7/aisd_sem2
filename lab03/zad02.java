package lab03;

public class zad02 {
	
	private static class Node{
		int number;
		Node next;
		
		Node(int nb){
			number = nb;
		}
	}
	//lista jednokierunkowa
	public static void main(String[] args) {
		 
		//pierwszy wezel
		Node first = new Node(10);
		
		//drugi wezel
		Node second = new Node(100);
		
		//łącze pierwszy i drugi wezel
		first.next = second;
		
		//trzeci wezel
		Node third = new Node(1000);
		second.next = third;
		
		for(Node x = first; x!=null; x=x.next) {
			System.out.print(x.number + " ");	
		}
		
	}
}