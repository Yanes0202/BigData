package san.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import san.edu.repositories.FemaleFullNameRepository;
import san.edu.repositories.FemaleLastNameRepository;
import san.edu.repositories.MaleFullNameRepository;
import san.edu.repositories.MaleLastNameRepository;
import san.edu.tables.*;
import san.edu.utils.CsvUtils;

import java.util.List;

@SpringBootApplication()
@EnableJpaRepositories("san.edu.repositories")
@EntityScan("san.edu.tables")
public class Application implements CommandLineRunner {
	@Autowired
	private FemaleFullNameRepository femaleFullNameRepository;
	@Autowired
	private FemaleLastNameRepository femaleLastNameRepository;
	@Autowired
	private MaleFullNameRepository maleFullNameRepository;
	@Autowired
	private MaleLastNameRepository maleLastNameRepository;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<FemaleFullName> femaleFullName = CsvUtils.mapFemaleFullName();
		List<FemaleLastName> femaleLastName = CsvUtils.mapFemaleLastName();
		List<MaleFullName> maleFullName = CsvUtils.mapMaleFullName();
		List<MaleLastName> maleLastName = CsvUtils.mapMaleLastName();
		femaleFullNameRepository.saveAll(femaleFullName);
		femaleLastNameRepository.saveAll(femaleLastName);
		maleFullNameRepository.saveAll(maleFullName);
		maleLastNameRepository.saveAll(maleLastName);
	}
}
