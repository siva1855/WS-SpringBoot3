package siva.bootjparepo.multipledb.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "postgreSqlEntityManagerFactory",
                     transactionManagerRef = "postgreSqlTransactionManager",
                     basePackages = "siva.bootjparepo.multipledb.repository.CustomerRepository")
public class PostgreSqlDBConfig {

	// DataSource
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource2")
	public DataSource postgreSqlDataSource() {
		return DataSourceBuilder.create().build();
	}

	// EntityManager
	@Bean
	public LocalContainerEntityManagerFactoryBean postgreSqlEntityManagerFactory(
			EntityManagerFactoryBuilder entityManagerFactoryBuilder) {
		Map<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "create");
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL10Dialect");
		return entityManagerFactoryBuilder.dataSource(postgreSqlDataSource())
				.packages("siva.bootjparepo.multipledb.bean.Customer").properties(properties)
				.persistenceUnit("spring.datasource2").build();
	}

	// TransactionManagement
	@Bean
	public PlatformTransactionManager postgreSqlTransactionManager(
			@Qualifier("postgreSqlEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

}
