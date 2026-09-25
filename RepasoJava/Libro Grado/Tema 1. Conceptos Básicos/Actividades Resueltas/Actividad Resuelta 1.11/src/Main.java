//Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas
//y peras. Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en
//kilos) de cada semestre para cada fruta. La aplicación mostrará el importe total sabien-
//do que el precio del kilo de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.

public class Main {

    public static double precioManzana = 2.35;
    public static double precioPera = 1.95;

    public static void main(String[] args) {
        int kgManzana1;
        int kgManzana2;
        int kgPera1;
        int kgPera2;
        double importeTotal;

        kgManzana1 = Escaner.pedirEntero("Kilos de manzanas Primer Trimestre: ");
        kgManzana2 = Escaner.pedirEntero("Kilos de manzanas Primer Segundo: ");
        kgPera1 = Escaner.pedirEntero("Kilos de peras Primer Trimestre: ");
        kgPera2 = Escaner.pedirEntero("Kilos de peras Primer Segundo: ");

        importeTotal = (kgManzana1 + kgManzana2) * precioManzana + (kgPera1 + kgPera2) * precioPera;

        System.out.println("Importe total: " + importeTotal + " euros");
    }
}