package workshop.spring5.event.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(String eventMsg) {
        System.out.println("CustomPublisher's thread:  " + Thread.currentThread().getName());
        applicationEventPublisher.publishEvent(new CustomEvent(this, eventMsg));
    }
}
