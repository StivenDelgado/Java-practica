package test;

import Herencia.Cliente;
import Herencia.Empleado;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        //creando empleados
        /* Empleado empleado1  = new Empleado("Matias", 870000.00);
        Empleado empleado2  = new Empleado("Juan", 870000.00);
        System.out.println("empleado1 = " + empleado1);
        System.out.println("empleado2 = " + empleado2);

         */

        //creando clientes
        var fecha = new Date();
        Cliente cliente1 = new Cliente("Alberto",
                'M',
                20,
                "barrio san mnz d casa 9",
                fecha,
                true);
        System.out.println("cliente1 = " + cliente1);

    }
}
