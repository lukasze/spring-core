package workshop.spring5.lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import workshop.spring5.lifecycle.service.HelloService;

@Configuration
@ComponentScan(basePackages = "workshop.spring5.lifecycle")
public class MainConfig {

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setHelloMsg("Just a message");
        return helloService;
    }
}
