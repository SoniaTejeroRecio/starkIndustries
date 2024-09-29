package seguridad;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificacionesWebSocketController {

    @MessageMapping("/alerta")
    @SendTo("/topic/alertas")
    public String enviarAlerta(String mensaje) {
        // Este mensaje será enviado a todos los suscriptores del canal /topic/alertas
        return "Alerta: " + mensaje;
    }
}
