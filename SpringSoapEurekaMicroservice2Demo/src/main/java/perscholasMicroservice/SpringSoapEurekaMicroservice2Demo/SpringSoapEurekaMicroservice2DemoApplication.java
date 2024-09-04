package perscholasMicroservice.SpringSoapEurekaMicroservice2Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringSoapEurekaMicroservice2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSoapEurekaMicroservice2DemoApplication.class, args);
	}

}
