package workshop.spring5.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import workshop.spring5.event.events.CustomPublisher;


public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        CustomPublisher publisher = (CustomPublisher) ctx.getBean("customPublisher");
        publisher.publishCustomEvent("my event here!");

        ((AnnotationConfigApplicationContext) ctx).close();

    }
}