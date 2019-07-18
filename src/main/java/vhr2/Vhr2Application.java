package vhr2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Vhr2Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Vhr2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("start...");
	}

}
