package com.Gabi.Mail.Services;

import com.Gabi.Mail.Models.OrdenProducto;

public interface OrdenService {

    public void sendConfirmacionOrden(OrdenProducto ordenProducto);

}
