package uk.co.trycatchfinallysoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "uk.co.trycatchfinallysoftware")
public class Application {
    public void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
