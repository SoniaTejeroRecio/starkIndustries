/*package seguridad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void enviarAlertaEmail(String destinatario, String asunto, String mensaje) {
        try {
            logger.info("Enviando alerta por correo a: " + destinatario);

            SimpleMailMessage email = new SimpleMailMessage();
            email.setTo(destinatario);
            email.setSubject(asunto);
            email.setText(mensaje);
            mailSender.send(email);
            logger.info("Correo enviado con éxito a: " + destinatario);

            // Enviar alerta en tiempo real a través de WebSocket
            messagingTemplate.convertAndSend("/topic/alertas", mensaje);

        } catch (MailException e) {
            logger.error("Error al enviar el correo: " + e.getMessage(), e);
        }
    }
}

 */
