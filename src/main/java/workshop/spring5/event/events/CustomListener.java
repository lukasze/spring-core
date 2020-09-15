package workshop.spring5.event.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("Received CustomEvent with a message: " + customEvent.getMsg());
        System.out.println("CustomLitener's thread:  " + Thread.currentThread().getName());
    }
}
