import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
			
			System.out.print("Wpisz liczbe: ");
			double liczba1 = keyboardInput.nextDouble();
			
			System.out.print("Wpisz znak(+, -, /, *): ");
			String  znak = keyboardInput.next();
			
			System.out.print("Wpisz kolejna liczbe: ");
			double liczba2 = keyboardInput.nextDouble();
		
			if(znak.equals("+")) {
				System.out.println(liczba1 + liczba2);
			} else if(znak.equals("-")) {
				System.out.println(liczba1 - liczba2);
			} else if(znak.equals("/")) {
				System.out.println(liczba1 / liczba2);
			} else if(znak.equals("*")) {
				System.out.println(liczba1 * liczba2);
			} else {
				System.out.println("Wpisałeś zły znak!");
			}
			
			
	}
	
}
