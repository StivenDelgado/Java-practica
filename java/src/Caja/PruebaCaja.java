package Caja;

public class PruebaCaja {
   public static void main(String args[]) {
       VolumenCaja VOLUMEN = new VolumenCaja();

       System.out.println("ancho: " + VOLUMEN.ancho);
       System.out.println("alto: " + VOLUMEN.alto);
       System.out.println("profundo: " + VOLUMEN.profundo);

       VolumenCaja VOLUMEN2 = new VolumenCaja(3, 2, 6);

       System.out.println("ancho: " + VOLUMEN2.ancho);
       System.out.println("alto: " + VOLUMEN2.alto);
       System.out.println("profundo: " + VOLUMEN2.profundo);


   }


}
