package se.omegapoint;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.actuate.system.ApplicationPidFileWriter;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication =
                new SpringApplication(Application.class);
        springApplication.addListeners(
                new ApplicationPidFileWriter("app.pid"));
        springApplication.run(args);
    }
}
