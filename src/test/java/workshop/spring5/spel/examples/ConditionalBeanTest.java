package workshop.spring5.spel.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import workshop.spring5.spel.examples.ConditionalBean;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ConditionalBeanTest {

    @Autowired
    private ConditionalBean conditionalBean;

    @Test
    public void shouldReturnBigger() {
        assertEquals("bigger", conditionalBean.getSize());
    }


}
