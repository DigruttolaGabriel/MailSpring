package com.Gabi.Mail.Models;

public class OrdenProducto {

    private String idOrden;

    private String nombreProducto;

    private Cliente infoCliente;

    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Cliente getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(Cliente infoCliente) {
        this.infoCliente = infoCliente;
    }

    @Override
    public String toString() {
        return "Orden numero " + this.idOrden + "\nNombre del producto " + this.nombreProducto + "\n" + infoCliente.toString();
    }


}
