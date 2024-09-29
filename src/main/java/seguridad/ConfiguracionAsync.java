package seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class ConfiguracionAsync {

    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);  // Número de hilos que estarán activos a la vez
        executor.setMaxPoolSize(10);  // Número máximo de hilos en el pool
        executor.setQueueCapacity(100);  // Cola de tareas pendientes
        executor.setThreadNamePrefix("SensorThread-");  // Prefijo de los nombres de los hilos
        executor.initialize();
        return executor;
    }
}