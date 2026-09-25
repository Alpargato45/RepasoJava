
    //Pedir tres números y mostrarlos ordenados de mayor a menor

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;


        num1 = Escaner.pedirEntero("Introduzca el primer número: ");
        num2 = Escaner.pedirEntero("Introduzca el segundo número: ");
        num3 = Escaner.pedirEntero("Introduzca el tercer número: ");

        if (num1 > num2 && num2 > num3) {
            System.out.println("");
        }
    }
}