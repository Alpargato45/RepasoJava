import java.util.Scanner;

public class Escaner {

    public static int pedirEntero(String texto) {
        int respuesta = 0;
        boolean correcto = false;
        Scanner scanner;
        scanner = new Scanner(System.in);
        while(!correcto) {
            try {
                System.out.println(texto);
                respuesta = scanner.nextInt();
                correcto = true;
            } catch (Exception e) {
                System.out.println("Introduce un valor válido");
                scanner.nextLine();
            }
        }
        return respuesta;
    }

    public static String pedirString(String texto) {
        String respuesta;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println(texto);
        respuesta = scanner.nextLine();

        return respuesta;
    }
}
