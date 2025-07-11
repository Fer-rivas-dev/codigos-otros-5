import java.util.Scanner;

/**
 * Este programa determina si un número ingresado por el usuario es "afortunado".
 * Un número es considerado afortunado si tiene más dígitos afortunados (3, 7, 8, 9)
 * que no afortunados.
 */
public class Codigo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //  Corrección: se agregó System.in como argumento

		System.out.print("Introduzca un número: ");
		String input = scanner.nextLine();

		//  Validación: asegurarse de que el input sea un número entero positivo
		int numero;
		try {
			numero = Integer.parseInt(input); //  Parsear el String a int
			if (numero < 0) {
				System.out.println("Por favor ingrese un número positivo.");
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida. Debe ingresar un número entero.");
			return;
		}

		int copia = numero; //  Copia del número original para mostrarlo al final
		int digitosAfortunados = 0;
		int digitosNoAfortunados = 0;

		//  Separar cada dígito y contar afortunados/no afortunados
		while (numero > 0) {
			int digito = numero % 10;

			if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
				digitosAfortunados++;
			} else {
				digitosNoAfortunados++;
			}

			numero /= 10; //  Quitar el último dígito
		}

		//  Evaluación final
		if (digitosAfortunados > digitosNoAfortunados) {
			System.out.println("El " + copia + " es un número afortunado.");
		} else {
			System.out.println("El " + copia + " no es un número afortunado.");
		}

		scanner.close(); //  Buenas prácticas: cerrar el scanner
	}
}
