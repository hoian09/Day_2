package beanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        // the bean as it loads into container

        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("beanslifecycle/beans.xml");
        BeanLifeCycleAnnotation lifeCycleAnnotation = new BeanLifeCycleAnnotation();
        lifeCycleAnnotation.doAnything();
        // destroy() method
    }
}
