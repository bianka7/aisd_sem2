package lab07;

public class InfixToPostfix {
    
	private static String infixToPostfix(String s) {
        Stos<Character> postfix = new Stos<>();
        String str = "";
        String num = "";

        for (int i = 0; i < s.length(); i++) {
        	char znak = s.charAt(i);
          if (Character.isDigit(znak)) { //jezeli znak jest cyfra
              num += znak; //dodaje do stringa num
          } else {
              if (!num.isEmpty()) { //jezeli string jest pusty
                  str += num; //dodaje do str 
                  num = ""; //usuwa cyfre z num
              }
                
                if (postfix.isEmpty() || znak == '(') { //jezeli stos jest pusty lub znak to (
                    postfix.push(znak); //dodaje znak
                } else if (znak == ')') { //jezeli to zamkniecie nawiasu
                    while (!postfix.isEmpty() && postfix.peek() != '(') { //"peek" pokazuje ostatni element w stosie, bez koniecznosci jego usuwania
                        str += postfix.pop() + " "; //dopoki stos nie jest pusty i ostatni element nie jest ( usuwamy element z postfix i dodajemy go do lancucha
                    }
                    postfix.pop(); // kiedy napotkamy znak ) usuwamy go ze stosu
                } else { //jezeli znak to operator  sprawdza 
                    while (!postfix.isEmpty() && pierwszenstwo(znak) <= pierwszenstwo(postfix.peek())) {
                         str += postfix.pop() + " "; //sprawdza priorytet znakow i usuwa elementy ze stosu do str 
                    }
                    postfix.push(znak); //kiedy nie ma operatorow o wyzszym priorytecie na stosie, aktualny operator jest dodawany na stos 
                }
            }
        }
        
        if (!num.isEmpty()) {  //dodaje ostatnia liczbe jezeli istnieje do stringa str
            str += num+ " ";
        }
        
        while (!postfix.isEmpty()) { //dodaje pozsotale operatory ze stosu postfix do lancucha str
            str += postfix.pop()+ " ";
        }
        
        return str;
    }
    
    private static int pierwszenstwo(char znak) { //sprawdza priorytet operatora, * / najwyzszy priorytet = 2, + - = 1
        if(znak == '+' || znak == '-') return 1;
        if(znak == '*' || znak == '/') return 2;
        return 0;
    }
    
    public static void main(String[] args) {
        String s = "2+34+5*6";
        String odp = infixToPostfix(s);
        System.out.print(odp);
    }
}

