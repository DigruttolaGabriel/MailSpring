package com.Gabi.Mail;

import com.Gabi.Mail.MailConfig.AppConfig;
import com.Gabi.Mail.Models.Usuario;
import com.Gabi.Mail.Services.UsuarioService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class MailApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
		usuarioService.sendConfirmacionOrden(getUsuario());
		((AbstractApplicationContext) context).close();
	}

	public static Usuario getUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombre("NOMBRE");
		usuario.setEmail("digruttolagabriel@gmail.com");
		return usuario;
	}
}
