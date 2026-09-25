
    //Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá
    //que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y
    //100. Mientras la solución introducida sea correcta, el juego continuará. En caso contra-
    //rio, el programa terminará y mostrará el número de operaciones realizadas correctamente.

public class Main {
    public static void main(String[] args) {
        boolean acertado = false;
        int contador = 0;
        int respuesta;
        int num1;
        int num2;

        do {
            num1 = (int) (Math.random() * 100 +1);
            num2 = (int) (Math.random() * 100 +1);

            respuesta = Escaner.pedirEntero("Cúal es la suma de " + num1 + " y " + num2 + " ?: ");
            if (respuesta == (num1+num2)) {
                contador++;
                System.out.println("Enhorabuena, acertaste. Llevas " + contador + " aciertos.");
                acertado = true;
            }else {
                System.out.println("Ohh! Has fallado, total de aciertos: " + contador);
                acertado = false;
            }
        }while (acertado);
    }
}