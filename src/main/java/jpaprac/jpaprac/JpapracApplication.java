package jpaprac.jpaprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JpapracApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpapracApplication.class, args);
	}

}
