package workshop.spring5.lifecycle.service;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

@Data
public class HelloService implements BeanFactoryPostProcessor {

    private String helloMsg = "Hello from HelloService";

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory");
        HelloService myService = configurableListableBeanFactory.getBean(HelloService.class);
        System.out.println("Hello from BeanFactoryPostProcessor");
    }
}
