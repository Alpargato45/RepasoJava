
    //Escribe una función a la que se pase como parámetros de entrada una cantidad de días,
    //horas y minutos. La función calculará y devolverá el número de segundos que existen en
    //los datos de entrada.

public class Main {

    static int pasarSegundos(int d, int h, int m) {
        int seg = 0;

        if (d>0){
            seg = seg + (((d*24)*60)*60);
        } else if (h>0) {
            seg = seg + ((h*60)*60);
        }else if (m>0) {
            seg = seg + (m*60);
        }

        return seg;
    }

    public static void main(String[] args) {
        int dia;
        int hora;
        int min;
        int seg;

        dia = Escaner.pedirEntero("Elige la cantidad de días: ");
        hora = Escaner.pedirEntero("Elige la cantidad de horas: ");
        min = Escaner.pedirEntero("Elige la cantidad de minutos: ");

        seg = pasarSegundos(dia,hora,min);

        System.out.println(dia + "días, " + hora + " horas y " + min + " minutos son: " + seg + " segundos");

    }
}