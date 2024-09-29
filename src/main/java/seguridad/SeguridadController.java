package seguridad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeguridadController {

    @GetMapping("/")
    public String home() {
        return "index"; // This should correspond to 'index.html' in 'src/main/resources/templates/'
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // This should correspond to 'login.html' in 'src/main/resources/templates/'
    }
}
