import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Reto_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el texto, por favor: ");
		
		String entrada = scanner.nextLine();
		
		boolean resultado = Heterograma.esHeterograma(entrada);
		if(resultado) {
			System.out.println("\nLa cadena es un heterograma.");
		}else
			System.out.println("La cadena no es un heterograma.");
		
		
		boolean resultado2 = Isograma.esIsograma(entrada);
		if(resultado2) {
			System.out.println("La cadena es un isograma.");
		}else
			System.out.println("La cadena no es un isograma.");
		
		
		boolean resultado3 = Pangrama.esPangrama(entrada);
		if(resultado3) {
			System.out.println("La cadena es un pangrama.");
		}else
			System.out.println("La cadena no es un pangrama.");
		
		scanner.close();
	}

}

class Heterograma{
	
	public static boolean esHeterograma(String input) {
		Set<Character> seenCharacters = new HashSet<>();
		
		for(char c : input.toLowerCase().replaceAll("\\s", "").toCharArray()) {
			if(seenCharacters.contains(c)) {
				return false;
			}else 
				seenCharacters.add(c);
		}
		return true;
	}
}

class Isograma{
	
	public static boolean esIsograma(String input) {
		Set<Character> seenCharacters = new HashSet<>();
		
		for(char c : input.toLowerCase().replaceAll("\\s", "").toCharArray()) {
			if(seenCharacters.contains(c)) {
				return false;
			}else 
				seenCharacters.add(c);
		}
		return true;
	}
}

class Pangrama{
	
	public static boolean esPangrama(String input) {
		Set<Character> letters = new HashSet<>();
		
		for(char c : input.toLowerCase().replaceAll("\\s", "").toCharArray()) {
			if(Character.isLetter(c)) {
				letters.add(c);
			}
		}
		for(char letter = 'a'; letter <= 'z'; letter++) {
			if(!letters.contains(letter)) {
				return false;
			}
		}
		return true;
	}
}
