package seguridad;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ServicioAsincrono {

    @Async
    public void realizarTareaAsincrona() {
        System.out.println("Tarea asíncrona ejecutada en un hilo separado.");
    }
}
