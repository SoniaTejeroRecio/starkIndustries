package seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final List<Sensor> sensores;  // Lista de todos los sensores disponibles

    @Autowired
    public SensorService(List<Sensor> sensores) {
        this.sensores = sensores;  // Spring inyectará todos los beans que implementen la interfaz Sensor
    }

    public void procesarTodosLosSensores() {
        for (Sensor sensor : sensores) {
            sensor.procesarDatos();  // Procesar los datos de cada sensor
        }
    }
}
