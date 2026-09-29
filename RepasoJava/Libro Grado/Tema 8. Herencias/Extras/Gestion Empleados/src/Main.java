
/*
 * EJERCICIO: GESTIÓN DE EMPLEADOS
 *
 * Crear:
 *
 * 1. Empleado:
 * - dni, nombre, salarioBase
 * - constructor, getters/setters
 * - calcularSalario() y mostrarInformacion()
 *
 * 2. Programador extends Empleado:
 * - lenguajePrincipal, proyectosCompletados
 * - salario = salarioBase + 100€ por proyecto
 * - sobrescribir calcularSalario()
 *
 * 3. Gerente extends Empleado:
 * - bonus
 * - salario = salarioBase + bonus
 * - sobrescribir calcularSalario()
 *
 * 4. Empresa:
 * - ArrayList<Empleado> empleados
 * - añadirEmpleado()
 * - buscarEmpleado(dni)
 * - eliminarEmpleado(dni)
 * - mostrarEmpleados()
 * - calcularCosteTotal()
 *
 * Usar polimorfismo para calcular los salarios.
 * No usar instanceof.
 * No permitir empleados con el mismo DNI.
 *
 * MAIN:
 * Crear una Empresa y añadir 2 Programadores,
 * 2 Gerentes y 1 Empleado.
 *
 * Probar: mostrar, buscar, eliminar y calcular
 * el coste salarial total.
 */

import Empleado.Empleado;
import Empleado.Empleos.Gerente;
import Empleado.Empleos.Programador;
import Empresa.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.addEmpleado(new Programador("26285532Q","Jorge",1300,"Java",7));
        empresa.addEmpleado(new Programador("86286532N","Pepe",1700,"Java",1));
        empresa.addEmpleado(new Gerente("44883377G","Alfredo",2700,450));
        empresa.addEmpleado(new Gerente("44533377P","Marta",2400,1050));
        empresa.addEmpleado(new Empleado("45173824J","Paula",4000));

        System.out.println(empresa.mostrarEmpleados());

        Empleado e;
        e = empresa.buscarEmpleado("26285532Q");
        System.out.println(e.mostrarInformacion());

        empresa.eliminarEmpleado("44883377G");

        double d;
        d = empresa.calcularCosteTotal();

        System.out.println("Costo total: " + d);
    }
}