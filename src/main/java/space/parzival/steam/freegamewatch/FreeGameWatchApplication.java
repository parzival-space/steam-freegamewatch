package space.parzival.steam.freegamewatch;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FreeGameWatchApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(FreeGameWatchApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}

}