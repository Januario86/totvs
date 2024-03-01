package br.com.totvs.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;

@Configuration
public class SpringDocConfig {
 
    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info().title("TOTVs - APIs").version("v1")
                        .description("APIs - TOTVS Cadastro Básico de Clientes")
                        .license(new License().name("TOTVS")))
                .tags(Arrays.asList(
                        new Tag().name("Cliente").description("")));
    }
}
   
