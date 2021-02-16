package br.com.coutomariel.springcommysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.coutomariel.springcommysql")
@EntityScan(basePackages = "br.com.coutomariel.springcommysql.model")
public class SpringComMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringComMysqlApplication.class, args);
	}

}
