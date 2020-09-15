package workshop.spring5.spel.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//    matches
@Component
public class RegexBean {
    @Value("#{'999' matches '\\d+' }")
    private boolean isNumericValue;

    public boolean isNumericValue() {
        return isNumericValue;
    }
}
