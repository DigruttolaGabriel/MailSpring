package com.Gabi.Mail.Services;

import com.Gabi.Mail.Models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    MailService mailService;

    @Override
    public void sendConfirmacionOrden(Usuario usuario) { mailService.sendEmail(usuario); }
}

