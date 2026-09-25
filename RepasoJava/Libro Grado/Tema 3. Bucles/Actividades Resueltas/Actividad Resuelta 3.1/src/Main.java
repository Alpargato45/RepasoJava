
    //Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si
    //es positivo y su cuadrado. El proceso se repetirá hasta que el número introducido sea 0.

public class Main {
    public static void main(String[] args) {
        int num;

        do {
            num = Escaner.pedirEntero("Seleccione un número: ");
            if (num % 2 == 0) {
                System.out.println(num + " es par");
            }else {
                System.out.println(num + " es impar");
            }
            if (num > 0) {
                System.out.println(num + " es positivo");
            }else {
                System.out.println(num + " es negativo");
            }
            System.out.println("El cuadrado de " + num + " es: " + (num*num));
        }while (num != 0);
    }
}