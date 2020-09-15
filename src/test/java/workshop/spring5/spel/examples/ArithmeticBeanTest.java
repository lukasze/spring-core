package workshop.spring5.spel.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import workshop.spring5.spel.examples.ArithmeticBean;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ArithmeticBeanTest {
    @Autowired
    private ArithmeticBean arithmeticBean;

    @Test
    public void getSum() {
        assertEquals(101, arithmeticBean.getSum());
    }
}

// TODO 1 zapoznaj się z projektem

// TODO 2 uruchom testy - jak trzeba zmodyfikować aplikację, żeby testy przeszły?
