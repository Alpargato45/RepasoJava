package Empleado.Empleos;

import Empleado.Empleado;

public class Gerente extends Empleado {

    private double bonus;

    public Gerente(String dni, String nombre, double salarioBase, double bonus) {
        super(dni, nombre, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return (super.calcularSalario()+bonus);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "Bonus: " + this.bonus;
    }
}
