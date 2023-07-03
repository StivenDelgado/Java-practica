package test;

import SobrecargaMetodos.Operaciones;

public class Testmetodos {
    public static void main(String[] args) {
        var resultado  = Operaciones.sumar(5,6);
        System.out.println("resultado = " + resultado);

        var resultado2 =  Operaciones.sumar(4.90, 6);
        System.out.println("resultado = " + resultado2);

        var resultado3 = Operaciones.sumar(4L, 3);
        System.out.println("resultado3 = " + resultado3);
    }
}
