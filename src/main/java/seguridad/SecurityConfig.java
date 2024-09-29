package seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/login", "/").permitAll()  // Páginas permitidas sin autenticación
                .antMatchers("/admin/**").hasRole("ADMIN")  // Solo el rol ADMIN puede acceder a /admin/**
                .antMatchers("/user/**").hasAnyRole("USER", "ADMIN")  // Tanto USER como ADMIN pueden acceder a /user/**
                .anyRequest().authenticated()  // Cualquier otra página requiere autenticación
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .permitAll()
                .and()
                .logout()
                .permitAll();

        return http.build();
    }


    // Definimos el UserDetailsService para gestionar los usuarios en memoria
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("adminpassword"))
                .roles("ADMIN")  // Rol ADMIN para el usuario administrador
                .build();

        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder().encode("userpassword"))
                .roles("USER")  // Rol USER para el usuario regular
                .build();

        return new InMemoryUserDetailsManager(admin, user);  // Dos usuarios: admin y user
    }


    // Definimos el PasswordEncoder para codificar las contraseñas
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Usa BCrypt para codificar las contraseñas
    }
}

