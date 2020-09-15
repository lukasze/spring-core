package workshop.spring5.spel.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//    +, -, *, /, %, ^, div, mod
@Component
public class ArithmeticBean {


    @Value("#{100 + 1}") // 101
    private int sum;

    public int getSum() {
        return sum;
    }

    // TODO 3 uzyj pozostałych wyrażeń (+, *, etc.), napisz dla nich testy
}


