package perscholasMicroservice.SpringSoapEurekaMicroserviceDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringSoapEurekaMicroserviceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSoapEurekaMicroserviceDemoApplication.class, args);
	}

}
