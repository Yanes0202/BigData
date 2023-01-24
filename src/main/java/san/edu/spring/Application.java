package san.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"san.edu.tables"})
public class Application implements CommandLineRunner {
	@Autowired
	private TableRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		FemaleLastName femaleLastName = new FemaleLastName();
		femaleLastName.setLastName("Anna Źdźbło");
		femaleLastName.setCount(10);
		repo.save(femaleLastName);
	}
}
