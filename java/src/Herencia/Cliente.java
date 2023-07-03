package Herencia;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean Vip;

    private static int contadorCliente;


    public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip) {
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fechaRegistro;
        Vip = vip;
            this.idCliente = ++Cliente.contadorCliente;
    }

    public int getIdCliente() {
        return this.idCliente;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.Vip;
    }

    public void setVip(boolean vip) {
        Vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", Vip=").append(Vip);
        sb.append(", Persona").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
