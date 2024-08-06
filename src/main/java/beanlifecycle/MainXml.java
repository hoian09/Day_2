package beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXml {
    public static void main(String[] args) {
        // the bean as it loads into container

        ApplicationContext context = new ClassPathXmlApplicationContext("beanslifecycle/beanss.xml");
        BeanLifeCycle lifeCycleXml = new BeanLifeCycle();
        lifeCycleXml.destroy();
        // destroy() method

    }
}
