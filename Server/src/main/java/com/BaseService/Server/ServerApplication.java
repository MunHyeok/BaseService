package com.BaseService.Server;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Log4j2
@SpringBootApplication
public class ServerApplication {


	public static void main(String[] args)
	{
		SpringApplication.run(ServerApplication.class, args);
		log.fatal("FATAL");
		log.error("ERROR");
		log.warn("WARN");
		log.info("INFO");
		log.debug("DEBUG");
		log.trace("TRACE");
	}

}
