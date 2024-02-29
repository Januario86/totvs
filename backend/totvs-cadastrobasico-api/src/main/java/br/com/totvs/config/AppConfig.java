package br.com.totvs.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	    @Bean
	    public RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder.build();
	    }	  
}
