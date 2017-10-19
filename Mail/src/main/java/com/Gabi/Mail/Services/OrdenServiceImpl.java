package com.Gabi.Mail.Services;

import com.Gabi.Mail.Models.OrdenProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrdenServiceImpl implements OrdenService{

        @Autowired
        MailService mailService;

        @Override
        public void sendConfirmacionOrden(OrdenProducto ordenProducto) {
            mailService.sendEmail(ordenProducto);
        }

    }
