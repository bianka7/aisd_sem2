package lab08;

public class zad02 {

	public static void main(String[] args) {
		String s = "ALFAROMEO";
		char[] heap = new char[s.length()+1];		
		int n = 0;
		
		for(n = 0; n < s.length(); n++) {
			char z = s.charAt(n);
			heap[n+1]=z; 	
			int k = n+1;
			while(k>1 && heap[k] > heap[k/2]) {
				char pom;
				
				pom = heap[k];
				heap[k]=heap[k/2];
				heap[k/2] = pom;
				
				k=k/2;
			}	
		}
		
		for(int i = 0; i < heap.length; i++) {
			System.out.print(heap[i]+" ");
			}
		
		if(isHeap(heap)) {
			System.out.print("jest kopcem");
		}
		else {
			System.out.print("nie jest kopcem");
		}
		
	}
	
	public static boolean isHeap(char[] heap) {
		for(int k=1; k<heap.length; k++) {
	        if(k < heap.length/2) {	
	        	if(heap[k]<heap[2*k] || heap[k]<heap[2*k+1]) {
	        		return false;
	        	}
	        }
		}
		return true;
	}
	
}
