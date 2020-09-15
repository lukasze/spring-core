package workshop.spring5.spel.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import workshop.spring5.spel.examples.LogicalBean;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class LogicalBeanTest {

    @Autowired
    private LogicalBean logicalBean;

    @Test
    public void isAgreed() {
        assertFalse(logicalBean.isAgreed());
    }
}