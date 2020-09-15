package workshop.spring5.spel.examples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("values")
public class ValuesBean {
    private List<Integer> _12345 = Arrays.asList(1,2,3,4,5);
    private int aValue = 100;
    private int bValue = 100;

    private boolean yes = true;
    private boolean no = false;

    public int getValueA() {
        return aValue;
    }
    public int getValueB() {
        return bValue;
    }

    public boolean isYes() {
        return yes;
    }

    public boolean isNo() {
        return no;
    }

    public List<Integer> get_12345() {
        return _12345;
    }
}
