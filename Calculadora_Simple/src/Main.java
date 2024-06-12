import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese el operador ( + , - , * , / ): ");
	String operador = scanner.nextLine();
	
	System.out.println("Ingrese un numero: ");
	double numero_1 = scanner.nextDouble();

	System.out.println("Ingrese otro numero: ");
	double numero_2 = scanner.nextDouble();
	
	
	if (operador.equals("+")) {
	double resultado = (numero_1 + numero_2);
	System.out.println("La suma es: " + resultado);
	
	}else if (operador.equals("-")) {
		double resultado = (numero_1 - numero_2);
		System.out.println("La resta es: " + resultado);
	
	}else if (operador.equals("*")) {
		double resultado = (numero_1 * numero_2);
		System.out.println("La multiplicación es: " + resultado);
	
	}else if (operador.equals("/")) {
		if (numero_2 != 0) {
		double resultado = (numero_1 / numero_2);
		System.out.println("La división es: " + resultado);	
    }else {
		System.out.println("No se puede dividir entre cero." );
          }
   
	}else {
		System.out.println("Operador no valido" );
	}
  }
}