
    //Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es
    //igual a 5 x 4 x 3 x 2 x 1 = 120.

public class Main {
    public static void main(String[] args) {
        int num;
        int factorial = 1;

        num = Escaner.pedirEntero("Escribe un número para ver su factorial: ");

        for (int i = num; i > 0; i--) {
            factorial = factorial*i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}