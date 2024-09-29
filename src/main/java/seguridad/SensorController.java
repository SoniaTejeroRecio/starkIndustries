package seguridad;

import seguridad.SensorMovimiento;
import seguridad.SensorService;
import seguridad.SensorTemperatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @Autowired
    private SensorMovimiento sensorMovimiento;

    @Autowired
    private SensorTemperatura sensorTemperatura;

    @GetMapping("/api/sensores/procesar")
    public String procesarSensores() {
        // Procesar varios sensores de manera asíncrona
        CompletableFuture<String> resultado1 = sensorService.procesarSensor(sensorMovimiento);
        CompletableFuture<String> resultado2 = sensorService.procesarSensor(sensorTemperatura);

        // Esperar que ambos sensores terminen de procesarse
        CompletableFuture.allOf(resultado1, resultado2).join();

        return "Procesamiento concurrente completado";
    }
}
