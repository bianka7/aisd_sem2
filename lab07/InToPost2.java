package lab07;

public class InToPost2 {
	    
	    private static String infixToPostfix(String s) {
	        Stos<Character> postfix = new Stos<>();
	        String str = "";
	        String num = "";

	        for (int i = 0; i < s.length(); i++) {
	            char znak = s.charAt(i);
	            
	            if (Character.isDigit(znak)) {
	                num += znak;
	            } else {
	                if (!num.isEmpty()) {
	                    str += num + " ";
	                    num = "";
	                }
	                
	                if (postfix.isEmpty() || znak == '(') {
	                    postfix.push(znak);
	                } else if (znak == ')') {
	                    while (!postfix.isEmpty() && postfix.peek() != '(') {
	                        str += postfix.pop() + " ";
	                    }
	                    postfix.pop();
	                } else {
	                    while (!postfix.isEmpty() && pierwszenstwo(znak) <= pierwszenstwo(postfix.peek())) {
	                        str += postfix.pop() + " ";
	                    }
	                    postfix.push(znak);
	                }
	            }
	        }
	        
	        if (!num.isEmpty()) {
	            str += num + " ";
	        }
	        
	        while (!postfix.isEmpty()) {
	            str += postfix.pop() + " ";
	        }
	        
	        return str;
	    }
	    
	    private static int pierwszenstwo(char op) {
	        if (op == '+' || op == '-') return 1;
	        if (op == '*' || op == '/') return 2;
	        return 0;
	    }
	    
	    public static void main(String[] args) {
	        String s = "2+34+5*6";
	        String odp = infixToPostfix(s);
	        System.out.println(odp); // Output: 2 34 + 5 6 * + 
	    }
	}
