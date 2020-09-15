package workshop.spring5.spel.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//    and, or, not, &&, ||, !
@Component
public class LogicalBean {

    @Value("#{ values.isYes() && values.isNo()}")
    private boolean agreed;

    public boolean isAgreed() {
        return agreed;
    }
}
