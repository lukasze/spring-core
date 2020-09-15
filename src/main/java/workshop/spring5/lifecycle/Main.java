package workshop.spring5.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import workshop.spring5.lifecycle.config.MainConfig;
import workshop.spring5.lifecycle.service.HelloService;

public class Main {


    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(((HelloService) ctx.getBean("helloService")).getHelloMsg());
        ((AnnotationConfigApplicationContext) ctx).close();

    }
}