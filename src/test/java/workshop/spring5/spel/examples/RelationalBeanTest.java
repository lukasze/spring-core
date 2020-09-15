package workshop.spring5.spel.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class RelationalBeanTest {
    @Autowired
    private RelationalBean relationalBean;

    @Test
    public void _1plus2shouldBeLessThan3plus4() {
        assertTrue(relationalBean.is_1plus2_less_3pluss4());
    }
}