package me.islim;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootTestApplication {

	public static void main(String[] args) {

		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootTestApplication.class);
		builder.bannerMode(Banner.Mode.OFF).run(args);

	}

}
