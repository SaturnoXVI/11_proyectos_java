/**
 *
 * @author Juan c
 */

import java.util.Scanner;

public class Calculadora {

    // Método para limpiar la consola utilizando caracteres de escape ANSI
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        limpiarConsola();

        // Pide el nombre del usuario.
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Pide la edad del usuario.
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Bienvenido(a), " + nombre + "! Puedes usar la calculadora.");
            System.out.println(" ");

            do {
                // Limpia la consola utilizando el método limpiarConsola()
                limpiarConsola();

                System.out.println("Elige una opción:");
                System.out.println("1. Realizar una operación");
                System.out.println("2. Calcular un porcentaje");
                System.out.println(" ");
                int opcion = scanner.nextInt();
                limpiarConsola();

                if (opcion == 1) {
                    // Resto del código para realizar operaciones (+, -, *, /)
                    System.out.println("Ingresa el primer número: ");
                    double primerNumero = scanner.nextDouble();

                    System.out.println("Ingresa el segundo número: ");
                    double segundoNumero = scanner.nextDouble();
                    limpiarConsola();

                    System.out.println("Elige la operación: ");
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Multiplicación");
                    System.out.println("4. División");
                    int operacion = scanner.nextInt();

                    double resultado;
                    switch (operacion) {
                        case 1:
                            resultado = primerNumero + segundoNumero;
                            break;
                        case 2:
                            resultado = primerNumero - segundoNumero;
                            break;
                        case 3:
                            resultado = primerNumero * segundoNumero;
                            break;
                        case 4:
                            resultado = primerNumero / segundoNumero;
                            break;
                        default:
                            System.out.println("Operación inválida.");
                            return;
                    }
                    limpiarConsola();

                    System.out.println("El resultado es: " + resultado);
                } else if (opcion == 2) {
                    // Calcular un porcentaje
                    System.out.println("Ingresa el número:");
                    double numero = scanner.nextDouble();
                    System.out.println("Ingresa el porcentaje:");
                    double porcentaje = scanner.nextDouble();
                    limpiarConsola();

                    double resultadoPorcentaje = (numero * porcentaje) / 100;
                    System.out.println("El " + porcentaje + "% de " + numero + " es: " + resultadoPorcentaje);
                } else {
                    System.out.println("Opción inválida.");
                }

                System.out.println("¿Quieres realizar otra operación? (s/n)");
                String continuar = scanner.next();
                if (!continuar.equalsIgnoreCase("s")) {
                    break;
                }

            } while (true);

            System.out.println("Calculadora finalizada.");
        } else {
            System.out.println("Lo siento, " + nombre + ". Debes ser mayor de 18 años para usar la calculadora.");
        }
    }
}
