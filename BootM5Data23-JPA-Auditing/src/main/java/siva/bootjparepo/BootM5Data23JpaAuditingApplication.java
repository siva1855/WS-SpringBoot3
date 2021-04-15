package siva.bootjparepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BootM5Data23JpaAuditingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootM5Data23JpaAuditingApplication.class, args);
	}

}
