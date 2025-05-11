package com.fitness.tracker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Serve static resources from src/main/resources/static
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");

        // Serve templates (e.g., Thymeleaf) from src/main/resources/templates
        registry.addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/templates/");

        // Optionally serve resources from src/main/webapp (uncomment if needed)
        // registry.addResourceHandler("/webapp/**")
        //         .addResourceLocations("file:src/main/webapp/");
    }
}