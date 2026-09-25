
    //Diseñar la función calculadora (), a la que se le pasan dos números reales (operandos)
    //y qué operación se desea realizar con ellos. Las operaciones disponibles son: sumar, res-
    //tar, multiplicar o dividir. Estas se especifican mediante un número: 1 para la suma, 2 para
    //la resta, 3 para la multiplicación y 4 para la división. La función devolverá el resultado de la
    //operación mediante un número real.

public class Main {

    static int calculadora(int opcion,int n1, int n2) {
        int resultado = 0;

        switch (opcion) {
            case 0 -> {
                //Vacío
            }
            case 1-> {
                resultado = n1+n2;
            }
            case 2-> {
                resultado = n1-n2;
            }
            case 3-> {
                resultado = n1*n2;
            }
            case 4-> {
                resultado = n1/n2;
            }
            default -> {
                System.out.println("Opción no disponible");
            }
        }

        return resultado;
    }


    public static void main(String[] args) {
        int opcion;
        int num1;
        int num2;
        int resultado;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");

            opcion = Escaner.pedirEntero("Elige una opción: ");
            num1 = Escaner.pedirEntero("Escriba el primer número: ");
            num2 = Escaner.pedirEntero("Escriba el segundo número: ");

            resultado = calculadora(opcion,num1,num2);

            System.out.println("El resultado de la operación es: " + resultado);

        }while (opcion != 0);
    }
}