package br.com.grupoacert.api.consumer;

import com.google.common.base.Predicates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class ConsumerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ConsumerApplication.class);
	}



	@Bean
	public Docket consumerApi() {
		return new Docket(DocumentationType.SWAGGER_2)//<3>
				.select()//<4>
				.apis(RequestHandlerSelectors.any())//<5>
				.paths(Predicates.not(PathSelectors.regex("/error.*")))//<6>, regex must be in double quotes.
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"Consume API",
				"Get conversion history.",
				"API DEMO",
				"",
				new Contact("Andre Conjo", "https://www.linkedin.com/in/andre-conjo-27492299/", "andrehconjo@gmail.com"),
				"License of API", "https://www.linkedin.com/in/andre-conjo-27492299/", Collections.emptyList());
	}

}
