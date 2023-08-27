package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.print("Ingresa el número a adivinar (entre 1 y 100): ");
        int numeroAdivinar = scanner.nextInt();
        
        if (numeroAdivinar < 1 || numeroAdivinar > 100) {
            System.out.println("El número debe estar entre 1 y 100.");
        } else {
            int intentos = 0;
            int intentoUsuario;

            do {
                System.out.print("Introduce tu intento: ");
                intentoUsuario = scanner.nextInt();
                intentos++;

                if (intentoUsuario < numeroAdivinar) {
                    System.out.println("El número es demasiado bajo. ¡Intenta nuevamente!");
                } else if (intentoUsuario > numeroAdivinar) {
                    System.out.println("El número es demasiado alto. ¡Intenta nuevamente!");
                }
            } while (intentoUsuario != numeroAdivinar);

            System.out.println("¡Felicidades! Adivinaste el número " + numeroAdivinar + " en " + intentos + " intentos.");
        }
    }
}
