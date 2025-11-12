/*
 ** Iris Aunnon Navarro
 ** Utiles de entrada/salida
 */

/* PAQUETE */
package utils;

/* LIBRERIA */
import java.util.Scanner;

public class EntradaSalida {
    /* CONSTANTES */
    public static final Scanner sc = new Scanner(System.in);

    /* METODOS */

    /* PINTAR POR PANTALLA */
    public static void escribirMensaje(String texto) {
        System.out.print(texto);
    }

    public static void escribirMensajeError(String texto) {
        System.err.println("ERROR: " + texto);
    }

    /* VALIDACION DE ENTRADAS */
    public static int validarEntero(String texto) {
        EntradaSalida.escribirMensaje(texto);

        while (!sc.hasNextInt()) {
            escribirMensajeError("El valor introducido no es un número entero.\nInténtalo de nuevo: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
