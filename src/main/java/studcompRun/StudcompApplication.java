package studcompRun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import base.pojos.rest.prod.Student;
import base.repositories.studentRepository.StudentRepository;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication(scanBasePackages = "base")
//@Configuration
//@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"base.repositories.studentRepository"})
@EntityScan(basePackages = "base.pojos.rest.prod", basePackageClasses = {StudcompApplication.class, Jsr310JpaConverters.class})

//@EntityScan(
//        basePackageClasses = {StudcompApplication.class, Jsr310JpaConverters.class}
//)


public class StudcompApplication {
	public static final Logger logger = LoggerFactory.getLogger(StudcompApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(StudcompApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(StudentRepository repository) {
		return (args) -> {
			Student student = repository.findOne(3);

            logger.info(student.getFirstname());
            logger.info(student.getLastname());
            logger.info(student.getEmailaddress());
            logger.info(student.getMobilenumber());
            logger.info(student.getDateofbirth().toString());


		};
	}

}
