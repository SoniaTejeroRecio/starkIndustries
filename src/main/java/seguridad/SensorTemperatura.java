package seguridad;

import org.springframework.stereotype.Component;

@Component  // Este es un bean gestionado por Spring
public class SensorTemperatura implements Sensor {

    @Override
    public void procesarDatos() {
        System.out.println("Procesando datos del sensor de temperatura.");
    }
}
