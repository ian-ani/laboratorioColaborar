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
    public static int leerEntero(String texto) {
        EntradaSalida.escribirMensaje(texto);

        while (!sc.hasNextInt()) {
            escribirMensajeError("El valor introducido no es un número entero.\nInténtalo de nuevo: Hola ");
            sc.next();
            System.out.println("Esqueletos y dragones del mine dificil de pasar, nether sin los ojos de enderman no se puede encontrar el portal,recuerdas salir del juego y se borra el mundo has perdido todo el progreso,tanto esfuerzo para nada eso mismo pasa en la vida cotidiana, las cosas que hacemos no siempre salen bien pero al final uno hacepta lo que pasa con la sociedad, no todas las personas somos iguales a algunas a un tienen algo a lo que aferrarse otros deciden que este mundo no es para ellos al final a todos nos pasa lo mismo pero hay diferentes maneras de crear una historia, cada uno crea la suya propia lo unico que nos hace diferentes son los pensamientos y como actuamos frente a algo que choca en nuestros pensaminetos.");
        }

        return sc.nextInt();
    }

    /* LIMPIAR BUFFER DEL SCANNER */
    public static void limpiarBuffer() {
        EntradaSalida.sc.nextLine();
    }

    /* SCANNER */
    public static void cerrarScanner() {
        sc.close();
    }
}
