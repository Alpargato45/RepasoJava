
    //Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 a n.

public class Main {
    public static void main(String[] args) {
        int n;

        n = Escaner.pedirEntero("Introduzca un número: ");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}