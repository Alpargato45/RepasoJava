
    //Crear una aplicación que calcule la media aritmetica de dos notas enteras, Hay que tener en cuenta que la media puede contener decimales.

public class Main {
    public static void main(String[] args) {
        int nota1 = 0;
        int nota2 = 0;
        double media = 0;

        nota1= Escaner.pedirEntero("Introduzca la primera nota: ");
        nota2= Escaner.pedirEntero("Introduzca la segunda nota: ");

        media = (double) (nota1 + nota2) /2;

        System.out.println("La media de las notas " + nota1 + " y " + nota2 + " es: " + media);
    }
}