package com.github.ionething.sparrow;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
@EnableCaching
@EnableAdminServer
public class SparrowSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SparrowSimpleApplication.class, args);
	}

}
