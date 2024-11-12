package br.edu.utfpr.pb.pw44s.projetofinal.security;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurity {

    @Bean
    @SneakyThrows
    public SecurityFilterChain filterChain(HttpSecurity http) {
        http
            .authorizeHttpRequests((authorize) -> authorize.anyRequest().permitAll()) // TODO configure security for other methods
            .csrf(AbstractHttpConfigurer::disable); // TODO re-enable at end of development
        return http.build();
    }
}