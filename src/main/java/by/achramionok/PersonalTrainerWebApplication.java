package by.achramionok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonalTrainerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalTrainerWebApplication.class, args);
	}

//	@Bean
//	@ConfigurationProperties(prefix="spring.datasource")
//	public static DataSource dataSource(@Value("${spring.datasource.schema}") String schema) {
//		DataSource datasource = (DataSource) DataSourceBuilder.create().build();
//		if(!schema.isEmpty() && datasource instanceof org.apache.tomcat.jdbc.pool.DataSource){
//			((org.apache.tomcat.jdbc.pool.DataSource) datasource).setInitSQL("ALTER SESSION SET CURRENT_SCHEMA=" + schema);
//		}
//		return datasource;
//	}
}
