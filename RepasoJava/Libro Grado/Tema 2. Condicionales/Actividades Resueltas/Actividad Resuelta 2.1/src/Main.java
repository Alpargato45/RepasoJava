
    //Diseñar una aplicación que solicite al usuario un número e indique si es par o impar

public class Main {
    public static void main(String[] args) {
        int numero;

        numero = Escaner.pedirEntero("Introduzca un número: ");

        if (numero % 2 == 0) {
            System.out.println("Su número es par");
        }else {
            System.out.println("Su número es impar");
        }
    }
}