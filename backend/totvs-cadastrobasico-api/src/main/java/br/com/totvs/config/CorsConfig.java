package br.com.totvs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class CorsConfig implements WebMvcConfigurer{

	/**
	 * Adiciona configurações CORS ao aplicativo.
	 *
	 * Este método é anotado com @Override e faz parte da implementação da interface WebMvcConfigurer.
	 * Ele configura as políticas CORS para permitir solicitações a partir de http://localhost:4200
	 * e especifica os métodos HTTP permitidos, incluindo GET, POST, OPTIONS, HEAD, TRACE e CONNECT.
	 *
	 * @param registry CorsRegistry - O registro de configurações CORS.
	 * @see WebMvcConfigurer
	 * @see CorsRegistry
	 */
	@Override
    public void addCorsMappings(CorsRegistry registry) {
    	registry
    	.addMapping("/**")
    	.allowedOrigins("http://localhost:4200")
    	.allowedMethods("GET", "POST", "OPTIONS", "HEAD", "TRACE", "CONNECT");    	        
    }
}
