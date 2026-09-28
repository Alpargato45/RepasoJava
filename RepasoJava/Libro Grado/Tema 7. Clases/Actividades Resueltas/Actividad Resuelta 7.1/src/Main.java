
    //Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así
    //como el saldo. Las operaciones típicas con una cuenta corriente son:
    //Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial sera 0.
    //Sacar dinero: el mét odo debe indicar si ha sido posible llevar a cabo la operación, si
    //existe saldo suficiente.
    //Ingresar dinero: se incrementa el saldo.
    //Mostrar informacion: muestra la informacion disponible de la cuenta corriente.

    //He hecho un poco lo q me ha dado la gana

    import java.util.ArrayList;

    public class Main {

    static boolean guardarCuenta(ArrayList<CuentaCorriente> listaCuentas, CuentaCorriente cuenta) {
        boolean added = true;
        for (CuentaCorriente c : listaCuentas) {
            if (c.dni.equals(cuenta.dni)) {
                added = false;
            }
        }
        if (added) {
            listaCuentas.add(cuenta);
        }
        return added;
    }

    static boolean comprobarDNI(String dni) {
        boolean dniValido = false;
        if (dni.matches("^\\d{8}[A-Z]$")) { //Esto significa 8 dígitos y una letra de la A a la Z
            dniValido = true;
        }
        return dniValido;
    }

    static int buscarCuenta(ArrayList<CuentaCorriente> listaCuentas, String dni) {
        int pos = -1;

        for (int i = 0; i < listaCuentas.size(); i++) {
            if (listaCuentas.get(i).dni.equals(dni)) {
                pos = i;
            }
        }

        return pos;
    }

    public static void main(String[] args) {
        int opcion;
        ArrayList<CuentaCorriente> agendaCuentas = new ArrayList<>();

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Crear cuenta nueva");
            System.out.println("2. Sacar Dinero");
            System.out.println("3. Ingresar Dinero");
            System.out.println("4. Mostrar Información de una cuenta");
            System.out.println("5. Mostrar Información de todas las cuentas");
            System.out.println("0. Salir");

            opcion = Escaner.pedirEntero("Elige una opción: ");

            switch (opcion) {
                case 0 -> {
                    //Vacío
                }
                case 1-> {
                    boolean added;
                    String dni;
                    String nombre;
                    CuentaCorriente c;

                    do {
                        dni = Escaner.pedirString("Introduzca el DNI(8 carácteres 1 letra): ");
                    }while (!comprobarDNI(dni));
                    nombre = Escaner.pedirString("Introduzca su nombre: ");

                    c = new CuentaCorriente(dni,nombre);

                    added = guardarCuenta(agendaCuentas,c);

                    if (added) {
                        System.out.println("Se han introducido correctamente los datos");
                    }else {
                        System.out.println("Ha ocurrido un error, DNI repetido, no se ha podido crear la cuenta");
                    }

                }
                case 2-> {
                    String dni;
                    int pos;
                    do {
                        dni = Escaner.pedirString("Introduzca el DNI de la cuenta: ");
                    }while (!comprobarDNI(dni));
                    pos = buscarCuenta(agendaCuentas,dni);
                    if (pos == -1) {
                        System.out.println("No se ha encontrado la cuenta de DNI: " + dni);
                    }else {
                        int dinero;
                        boolean sacado;
                        do {
                            dinero = Escaner.pedirEntero("Introduzca la cantidad a sacar: ");
                        }while (dinero <= 0);

                        sacado = agendaCuentas.get(pos).sacarDinero(dinero);
                        if (sacado) {
                            System.out.println("Se ha completado la transacción con éxito, dinero sacado: " + dinero);
                        }else {
                            System.out.println("No se ha podido completar la transacción, no queda suficiente dinero en la cuenta.");
                        }
                    }

                }
                case 3-> {
                    String dni;
                    int pos;
                    do {
                        dni = Escaner.pedirString("Introduzca el DNI de la cuenta: ");
                    }while (!comprobarDNI(dni));
                    pos = buscarCuenta(agendaCuentas,dni);
                    if (pos == -1) {
                        System.out.println("No se ha encontrado la cuenta de DNI: " + dni);
                    }else {
                        int dinero;
                        do {
                            dinero = Escaner.pedirEntero("Introduzca la cantidad a meter: ");
                        }while (dinero <= 0);

                        agendaCuentas.get(pos).meterDinero(dinero);
                        System.out.println("Dinero introducido correctamente.");
                    }
                }
                case 4-> {
                    String dni;
                    int pos;
                    do {
                        dni = Escaner.pedirString("Introduzca el DNI de la cuenta: ");
                    }while (!comprobarDNI(dni));
                    pos = buscarCuenta(agendaCuentas,dni);
                    if (pos == -1) {
                        System.out.println("No se ha encontrado la cuenta de DNI: " + dni);
                    }else {
                        System.out.println(agendaCuentas.get(pos).toString());
                    }
                }
                case 5-> {
                    for (CuentaCorriente c: agendaCuentas) {
                        System.out.println(c.toString());
                    }
                }
                default -> {
                    System.out.println("Opción no disponible");
                }
            }
        }while (opcion != 0);
    }
}