import java.util.Scanner;

public class Reto_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el texto a traducir a 'lenguaje hacker':");
		
		String entrada = scanner.nextLine().toLowerCase();
		
		String texto = Traductor.convertidorLeet(entrada);
		
		System.out.println("");
		System.out.println("Texto traducido: " + texto);

		scanner.close();
	}

}

class Traductor{
	
	public static String convertidorLeet(String input) {
		input = input.replace("a", "4");
		input = input.replace("b", "|3");
		input = input.replace("c", "[");
		input = input.replace("d", ")");
		input = input.replace("e", "3");
		input = input.replace("f", "|=");
		input = input.replace("g", "&");
		input = input.replace("h", "#");
		input = input.replace("i", "1");
		input = input.replace("j", ",_|");
		input = input.replace("k", ">|");
		input = input.replace("l", "1");
		input = input.replace("m", "^^");
		input = input.replace("n", "^/");
		input = input.replace("o", "0");
		input = input.replace("p", "|*");
		input = input.replace("q", "(_,)");
		input = input.replace("r", "|2");
		input = input.replace("s", "5");
		input = input.replace("t", "7");
		input = input.replace("u", "(_)");
		input = input.replace("v", "v");
		input = input.replace("w", "vv");
		input = input.replace("x", "><");
		input = input.replace("y", "j");
		input = input.replace("z", "2");
		input = input.replace("", "");
		return input;
		
	}
	
}
