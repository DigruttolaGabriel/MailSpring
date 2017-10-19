package com.Gabi.Mail.MailConfig;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@ComponentScan(basePackages = "com.Gabi.Mail")
public class AppConfig {

        @Bean
        public JavaMailSender getMailSender(){
            JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

            //USANDO GMAIL
            mailSender.setHost("smtp.gmail.com");
            mailSender.setPort(587);
            mailSender.setUsername("mmcaptton@gmail.com");
            mailSender.setPassword("Captton00!!");


            Properties javaMailProperties = new Properties();
            javaMailProperties.put("mail.smtp.starttls.enable", "true");
            javaMailProperties.put("mail.smtp.auth", "true");
            javaMailProperties.put("mail.transport.protocol", "smtp");
            javaMailProperties.put("mail.debug", "true");//IMPRIME POR CONSOLA

            mailSender.setJavaMailProperties(javaMailProperties);
            return mailSender;
        }
    }
