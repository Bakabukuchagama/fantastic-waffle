package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ServletComponentScan
@EnableJpaRepositories

public class app {
    public static void main(String[] args) {
        SpringApplication.run(app.class,args);
    }
}
