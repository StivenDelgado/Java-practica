package Caja;

public class VolumenCaja {
    int ancho;
    int alto;
    int profundo;

    public VolumenCaja(){
        System.out.println("Ejecutando constructor");
    }
    public VolumenCaja(int a, int b, int c) {
            this.ancho = a;
            this.alto = b;
            this.profundo = c;

        System.out.println("Ejecutando constructor con args");
        System.out.println("El volumen de la caja es igual a : " + (this.ancho * this.alto * this.profundo));
    }
}
