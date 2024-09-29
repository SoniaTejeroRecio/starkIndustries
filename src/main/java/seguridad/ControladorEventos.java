package seguridad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ControladorEventos {

    @GetMapping("/eventos")
    public String verEventos(Model model) {
        // Simulación de datos de eventos procesados por sensores
        List<EventoSensor> eventos = Arrays.asList(
                new EventoSensor("Sensor de Movimiento", 10),
                new EventoSensor("Sensor de Temperatura", 8),
                new EventoSensor("Sensor de Humedad", 5)
        );

        model.addAttribute("eventos", eventos);
        return "eventos";
    }

    public static class EventoSensor {
        private String tipo;
        private int cantidad;

        public EventoSensor(String tipo, int cantidad) {
            this.tipo = tipo;
            this.cantidad = cantidad;
        }

        public String getTipo() {
            return tipo;
        }

        public int getCantidad() {
            return cantidad;
        }
    }
}
