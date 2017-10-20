package masterspringmvc.masterspringmvc;

import masterspringmvc.masterspringmvc.config.PictureUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({PictureUploadProperties.class})
public class MasterspringmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterspringmvcApplication.class, args);
	}
}
