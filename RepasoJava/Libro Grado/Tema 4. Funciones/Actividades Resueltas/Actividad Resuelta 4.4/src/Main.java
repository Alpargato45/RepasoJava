
    //Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos.

public class Main {

    static int devolverMayor(int num1,int num2){
        int mayor;

        if (num1>num2) {
            mayor = num1;
        }else {
            mayor = num2;
        }
        return mayor;
    }
    public static void main(String[] args) {
        int num1;
        int num2;
        int mayor;

        num1 = Escaner.pedirEntero("Escriba el primer número");
        num2 = Escaner.pedirEntero("Escriba el segundo número");

        mayor = devolverMayor(num1,num2);

        System.out.println("El mayor de esos números es: " + mayor);
    }
}