import java.util.Scanner;

public class Ej6P2 {
	
	public static void main(String[] args) {

		/*
		 * 1. Declaración de variables
		 */
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		double suma, resta, multiplicacion, division, potencia, raizCuadrada;
		
		
		/*
		 * 2. Inicialización de variables
		 */
		System.out.println("Por favor introduzca el primer número");
		x = sc.nextDouble();
		
		System.out.println("Por favor introduzca el segundo número");
		y = sc.nextDouble();
		
		
		/*
		 * 3. Introducción de datos
		 */
		suma = x + y;
		resta = x - y;
		multiplicacion = x * y;
		division = x / y;
		
		 potencia = Math.pow(x, y);
		 raizCuadrada = Math.sqrt(y);
		
		
		/*
		 * 4. Salida de datos
		 */
		System.out.println("SUMA:\t\t" + suma);
		System.out.println("RESTA:\t\t" + resta);
		System.out.println("MULTIPLICACIÓN:\t" + multiplicacion);
		System.out.println("DIVISIÓN:\t" + division);
		
		System.out.println("POTENCIA:\t" + potencia);
		System.out.println("RAÍZ CUADRADA:\t" + raizCuadrada);

	}

}