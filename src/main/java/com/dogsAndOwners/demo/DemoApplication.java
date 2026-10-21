package com.dogsAndOwners.demo;

import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	CommandLineRunner getCommandlineRunner(
			OwnerRepository ownerRepository,
			DogRepository dogRepository
	) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args){

				String[] dogNames = {
						"Burek",
						"Azor",
						"Reksio",
						"Luna",
						"Max"
				};


				if(args.length > 0) {
					String ownerName = args[0];
					Owner owner = new Owner(ownerName);
					ownerRepository.save(owner);
					Random random = new Random();
					Integer randomAge = random.nextInt(1, 17);
					String randomName = dogNames[random.nextInt(dogNames.length)];
					Dog dog = new Dog(randomName, randomAge, owner);
					dogRepository.save(dog);
				}else{
					double averageDogAge = dogRepository.getAverageDogAge();
					System.out.println("Average age: " + averageDogAge);
				}


			}
		};
	}
}