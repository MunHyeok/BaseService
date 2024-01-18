package com.BaseService.Server;

import com.BaseService.Server.Database.Entities.UserEntity;
import com.BaseService.Server.Database.Repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class ServerApplication {
	@Autowired
	static UserRepository repoTest;

	public static void main(String[] args)
	{
		SpringApplication.run(ServerApplication.class, args);
		repoTest.save(UserEntity
				.builder()
				.userID("test")
				.email("test@test.com")
				.password("test")
				.phoneNumber("010-1234-1234")
				.build());

	}
}
