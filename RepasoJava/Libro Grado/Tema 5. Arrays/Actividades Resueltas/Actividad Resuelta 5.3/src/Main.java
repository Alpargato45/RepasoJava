
    //Escribir una aplicación que solicite al usuario cuántos números desea introducir. A conti-
    //nuación, introducir por teclado esa cantidad de números enteros, y por último, mostrar en
    //el orden inverso al introducido.

public class Main {
    public static void main(String[] args) {
        int longitud;
        int [] lista;
        longitud = Escaner.pedirEntero("Escriba cuantos números desea escribir: ");
        lista = new int[longitud];

        for (int i = 0; i < lista.length; i++) {
            int n;
            n = Escaner.pedirEntero("Número " + (i+1) + " : ");
            lista[i] = n;
        }
        for (int i = lista.length - 1; i >= 0; i--) {
            System.out.println(lista[i]);
        }
    }
}