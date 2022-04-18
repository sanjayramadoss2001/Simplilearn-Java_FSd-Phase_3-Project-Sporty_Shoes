package com.sportyshoes.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket superHeroApiDoc() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.sportyshoes.webservice")).build().apiInfo(apiInfo());	
	}
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return  new  ApiInfo("Sporty Shoes ", 
				"Sporty Shoes online store", "1.0.0",
				"Term of service as per user guide lines.", "Sanjay R", "Apache Lience Version 2.0", 
				"https://www.apache.org/licenses/LICENSE-2.0.html");
	}
}
