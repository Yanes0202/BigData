package san.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import san.edu.repositories.FemaleFullNameRepository;
import san.edu.repositories.FemaleLastNameRepository;
import san.edu.repositories.MaleFullNameRepository;
import san.edu.repositories.MaleLastNameRepository;

@SpringBootApplication()
@EnableJpaRepositories("san.edu.repositories")
@EntityScan("san.edu.tables")
@ComponentScan(basePackages = "san.edu.controllers")
public class Application implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
