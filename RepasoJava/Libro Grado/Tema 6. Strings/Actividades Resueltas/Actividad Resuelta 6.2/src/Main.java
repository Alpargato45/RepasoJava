
    //Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que
    //contiene menos caracteres.

public class Main {
    static int devolverLongitud(String frase) {
        int longitud;

        longitud = frase.length();

        return longitud;
    }
    public static void main(String[] args) {
        String frase1;
        String frase2;

        frase1 = Escaner.pedirString("Primera frase: ");
        frase2 = Escaner.pedirString("Segunda frase: ");

        if (devolverLongitud(frase1) > devolverLongitud(frase2)) {
            System.out.println("La frase: " + frase1 + " es más larga, con " + devolverLongitud(frase1) + " carácteres");
        }else {
            System.out.println("La frase: " + frase2 + " es más larga, con " + devolverLongitud(frase2) + " carácteres");
        }
    }
}