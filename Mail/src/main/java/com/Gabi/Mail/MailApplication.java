package com.Gabi.Mail;

import com.Gabi.Mail.MailConfig.AppConfig;
import com.Gabi.Mail.Models.Cliente;
import com.Gabi.Mail.Models.OrdenProducto;
import com.Gabi.Mail.Services.OrdenService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class MailApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		OrdenService orderService = (OrdenService) context.getBean("orderService");
		orderService.sendConfirmacionOrden(getDummyOrder());
		((AbstractApplicationContext) context).close();
	}

	public static OrdenProducto getDummyOrder() {
		OrdenProducto order = new OrdenProducto();
		order.setIdOrden("NUMEROORDEN");
		order.setNombreProducto("PRODUCTO");

		Cliente customerInfo = new Cliente();
		customerInfo.setNombre("CLIENTE");
		customerInfo.setDireccion("DIRECCION");
		customerInfo.setEmail("digruttolagabriel@gmail.com");
		order.setInfoCliente(customerInfo);
		return order;
	}
}
