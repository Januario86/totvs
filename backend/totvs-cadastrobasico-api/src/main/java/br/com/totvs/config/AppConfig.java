package br.com.totvs.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	/**
	 * Configura e fornece uma instância de RestTemplate.
	 *
	 * Este método é anotado com @Bean, indicando que ele é gerenciado pelo contêiner Spring como um bean.
	 * Ele utiliza um RestTemplateBuilder para construir e configurar uma instância de RestTemplate.
	 *
	 * @param builder RestTemplateBuilder - O construtor para criar e configurar a instância de RestTemplate.
	 * @return RestTemplate - A instância de RestTemplate configurada e pronta para uso.
	 * @see RestTemplateBuilder
	 * @see RestTemplate
	 */
	    @Bean
	    public RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder.build();
	    }	  
}

