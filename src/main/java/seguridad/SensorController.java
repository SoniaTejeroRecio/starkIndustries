package seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @GetMapping("/sensores/procesar")
    public String procesarSensores() {
        sensorService.procesarTodosLosSensores();  // Llama al servicio para procesar los sensores
        return "Procesamiento de sensores iniciado.";
    }
}
