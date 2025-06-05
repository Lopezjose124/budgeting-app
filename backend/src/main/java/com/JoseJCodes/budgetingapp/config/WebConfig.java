
package com.JoseJCodes.budgetingapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**") // Apply to all endpoints
        .allowedOrigins("http://localhost:5173") // frontend dev server
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Methods to allow
        .allowedHeaders("*") // Allow all headers
        .allowCredentials(true); // If you're using cookies or authorization headers
  }
}
