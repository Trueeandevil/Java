import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			double num1 = keyboardInput.nextDouble();
			
			System.out.print("Enter a operator(+, -, /, *): ");
			String  op = keyboardInput.next();
			
			System.out.print("Enter another number: ");
			double num2 = keyboardInput.nextDouble();
			
			while(num1 + num2 !=0) {
				if(op.equals("+")){
		            System.out.println(num1 + num2);
		        }

		        else if(op.equals("-")){
		            System.out.println(num1 - num2);
		        }

		        else if(op.equals("*")){
		            System.out.println(num1 * num2);
		        }   

		        else if(op.equals("/")){
		            System.out.println(num1 / num2);
		        }

		        else if(op.equals("%")){
		            System.out.println(num1 % num2 + num2);
		        }

		        else {
		        	System.out.println("Operation cannot be executed");
		        }
				
				System.out.println("Enter a number: ");
                if(num1 + num2 != 0);
                                break;
				
				
			}
		
			
			
			
	}
	
}
