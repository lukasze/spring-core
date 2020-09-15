package workshop.spring5.spel.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//    <, >, ==, !=, <=, >=, lt, gt, eq, ne, le, ge
public class RelationalBean {


    @Value("#{(values.get_12345()[0] + values.get_12345()[1]) < (values.get_12345()[2] + values.get_12345()[3])}")
    private boolean _1plus2_less_3pluss4;

    public boolean is_1plus2_less_3pluss4() {
        return _1plus2_less_3pluss4;
    }

    // TODO 4 uzyj pozostałych wyrażeń (lt, gt, etc.), napisz dla nich testy

}