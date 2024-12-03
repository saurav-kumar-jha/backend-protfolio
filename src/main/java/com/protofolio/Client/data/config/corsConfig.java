package com.protofolio.Client.data.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
public class corsConfig implements WebMvcConfigurer{
    @Value(value = "${frontend_url}")
    private String frontend_url;
    
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){

        corsRegistry.addMapping("/**")
                .allowedOrigins(frontend_url)
                .allowedMethods("GET","POST","PUT","DELETE")
                .allowedHeaders("*")                
                .maxAge(3600);
    }
}
