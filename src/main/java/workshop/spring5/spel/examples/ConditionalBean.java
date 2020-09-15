package workshop.spring5.spel.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//    ?:
@Component
public class ConditionalBean {
    @Value("#{values.getValueA() > 90 ? 'bigger' : 'smaller'}") // "a"
    private String actualSize;

    public String getSize() {
        return actualSize;
    }
}
