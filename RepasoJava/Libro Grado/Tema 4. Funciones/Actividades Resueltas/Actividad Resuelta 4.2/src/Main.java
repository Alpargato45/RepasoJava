
    //Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos

public class Main {

    static void valoresComprendidos(int n1, int n2) {
        int mayor;
        int menor;

        if (n1> n2) {
            mayor = n1;
            menor = n2;
        }else {
            mayor = n2;
            menor = n1;
        }
        for (int i = menor; i <= mayor ; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int num1;
        int num2;

        num1 = Escaner.pedirEntero("Primer número: ");
        num2 = Escaner.pedirEntero("Segundo número: ");

        valoresComprendidos(num1,num2);
    }
}