package com.Gabi.Mail.Services;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.Gabi.Mail.Models.OrdenProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailServiceImpl implements MailService {

    //REMITENTE
    @Autowired
    JavaMailSender mailSender;

    @Override
    public void sendEmail(Object object) {

        OrdenProducto order = (OrdenProducto) object;

        MimeMessagePreparator preparator = getMessagePreparator(order);

        try {
            mailSender.send(preparator);
            System.out.println("Message Send...Hurrey");
        } catch (MailException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private MimeMessagePreparator getMessagePreparator(final OrdenProducto order) {

        MimeMessagePreparator preparator = new MimeMessagePreparator() {

            public void prepare(MimeMessage mimeMessage) throws Exception {
                mimeMessage.setFrom("customerserivces@yourshop.com");
                mimeMessage.setRecipient(Message.RecipientType.TO,
                        new InternetAddress(order.getInfoCliente().getEmail()));
                mimeMessage.setText("TEXTO");
                mimeMessage.setSubject("ASUNTO");
            }
        };
        return preparator;
    }

}