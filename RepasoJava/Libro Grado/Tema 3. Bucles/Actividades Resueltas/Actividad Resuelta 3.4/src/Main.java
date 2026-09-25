
    //Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es
    //el árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) de cada
    //árbol (terminando la introducción de datos cuando se utilice -1 como altura). Los árboles
    //se identifican mediante etiquetas con números únicos correlativos, comenzando en O. Di-
    //señar una aplicación que resuelva el problema planteado.

public class Main {
    public static void main(String[] args) {
        int id = 0;
        int longArbol;
        int mayor = 0;
        int contador = 0;


        longArbol = Escaner.pedirEntero("Introduzca la longitud del árbol en cm: ");
        while (longArbol != -1) {
            if (longArbol > mayor) {
                mayor = longArbol;
                id = contador;
            }
            contador++;
            longArbol = Escaner.pedirEntero("Introduzca la longitud del árbol en cm: ");
        }
        System.out.println("El árbol más alto es el árbol de id " + id + " de longitud " + mayor);
    }
}