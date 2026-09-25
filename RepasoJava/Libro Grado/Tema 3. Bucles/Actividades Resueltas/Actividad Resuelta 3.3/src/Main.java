
    //Codificar el juego «el número secreto», que consiste en acertar un número entre 1 y 100
    //(generado aleatoriamente). Para ello se introduce por teclado una serie de números, para
    //los que se indica: «mayor» 0 «menor», según sea mayor o menor con respecto al núme-
    //ro secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introducien-
    //do un -1).

public class Main {

    public static int numRandom = (int) (Math.random() * 100 + 1);

    public static void main(String[] args) {
        int num;

        //System.out.println(numRandom);

        num = Escaner.pedirEntero("Introduce un número: ");
        while(num != numRandom && num != -1) {
            if (num > numRandom) {
                System.out.println("El número es menor a " + num);
            }else {
                System.out.println("El número es mayor a " + num);
            }
            num = Escaner.pedirEntero("Introduce un número: ");
        }
        if (num == numRandom) {
            System.out.println("Acertaste! El número era: " + numRandom);
        }else {
            System.out.println("Te has rendido! El número era: " + numRandom);
        }

    }
}