
    //Diseñar un programa que solicite al usuario que introduzca por teclado 5 números deci-
    //males. A continuación, mostrar los números en el mismo orden que se han introducido.

    import java.util.Arrays;

    public class Main {
    public static void main(String[] args) {
        double[] lista = new double[5];

        for (int i = 0; i < lista.length; i++) {
            double n;
            n = Escaner.pedirDouble("Escribe el número " + (i+1) + ": ");

            lista[i] = n;
        }
        System.out.println(Arrays.toString(lista));
    }
}