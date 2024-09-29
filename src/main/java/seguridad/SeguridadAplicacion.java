package seguridad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync  // Habilitar concurrencia asíncrona
public class SeguridadAplicacion {

    public static void main(String[] args) {
        SpringApplication.run(SeguridadAplicacion.class, args);
    }
}
