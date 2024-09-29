package seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertaController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/enviar-alerta")
    public String enviarAlerta() {
        emailService.enviarAlertaEmail("destinatario@example.com", "Alerta de Seguridad", "Se ha detectado una intrusión.");
        return "Alerta enviada por correo electrónico.";
    }
}
