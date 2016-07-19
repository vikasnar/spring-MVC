package com.sumi;

import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.core.io.DefaultResourceLoader;

@SpringBootApplication
public class SpringMvcApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        builder
                .banner(new ResourceBanner(new DefaultResourceLoader().getResource("banner.txt")))
                .sources(SpringMvcApplication.class);
		return builder;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}
}
