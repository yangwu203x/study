package com.casclient.casclient;

import com.casclient.casclient.config.CasConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@Import(CasConfig.class)
@SpringBootApplication
public class CasclientApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CasclientApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CasclientApplication.class);
	}

}
