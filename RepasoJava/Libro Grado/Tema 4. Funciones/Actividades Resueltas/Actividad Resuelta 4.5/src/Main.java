
    //Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro corresponde con una vocal.

public class Main {

    static boolean esVocal(String s) {
        boolean esVocal = false;
        s = s.toUpperCase();

        switch (s) {
            case "A","E","I","O","U" -> {
                esVocal = true;
            }
            default -> {
                esVocal = false;
            }
        }
        return esVocal;
    }
    public static void main(String[] args) {
        String s;
        boolean esVocal;
        s = Escaner.pedirString("Escribe una letra para saber si es vocal o no: ");

        esVocal = esVocal(s);

        System.out.println("La letra " + s + " es Vocal?: " + esVocal);
    }
}