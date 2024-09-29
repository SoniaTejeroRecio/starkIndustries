package seguridad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String userAccess() {
        return "Acceso permitido para USER y ADMIN";
    }
}
