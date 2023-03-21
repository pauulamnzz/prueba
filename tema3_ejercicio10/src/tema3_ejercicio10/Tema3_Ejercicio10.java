/*
 * Prueba GIT 
 */

package tema3_ejercicio10;

import java.util.Scanner;

public class Tema3_Ejercicio10 {

	public static void main(String[] args) {
		double ne1, ne2, ne3, nmedia;
		Scanner m = new Scanner(System.in);
		try {
			System.out.print("Escriba su nota de la primera evaluación: ");
			ne1 = m.nextDouble();
			System.out.print("Escriba su nota de la segunda evaluación: ");
			ne2 = m.nextDouble();
			System.out.print("Escriba su nota de la tercera evaluación: ");
			ne3 = m.nextDouble();

			nmedia = (ne1 + ne2 + ne3) / 3;
			System.out.println("Su nota media es: " + nmedia);
		}catch(NumberFormatException e) {
			System.out.println("ERROR: "+e.getMessage());
		} 
		
		
		
	}

}
/*
 * FIN
 */
