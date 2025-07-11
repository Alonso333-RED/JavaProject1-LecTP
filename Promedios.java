
/*Crear un programa que calcule el promedio de cinco notas positivas ingresadas por teclado.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        
        double note = 0;
        double notes = 0;
        int quantity = 0;

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("Ingrese la cantidad de notas a evaluar: ");
                quantity = scanner.nextInt();
                if (quantity <= 0) {
                    System.out.println("Ingrese un intervalo valido.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un valor válido");
                scanner.next();
            }
        }

        for (int i = 1; i <= quantity; ) {
            System.out.println("Ingrese la nota " + i + ":");
            try {
                note = scanner.nextDouble();
                if (note < 1 || note > 7) {
                    System.out.println("Ingrese una nota válida.");
                } else {
                    notes += note;
                    i++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un valor válido");
                scanner.next();
            }
        }
        double result = 0;
        result = notes / quantity;
        
        System.out.println("Resultados Estudiante");
        System.out.println("Prmedio Final: " + result);
        System.out.println("Notas: " + quantity);
    }
}