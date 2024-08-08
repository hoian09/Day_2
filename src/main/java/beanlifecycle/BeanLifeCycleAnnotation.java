package beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeCycleAnnotation {
    @PostConstruct
    public void init()  throws Exception{
        System.out.println("init method is called");
    }
    @PreDestroy
    public void destroy()  throws RuntimeException {
        System.out.println("destroy method is called");
    }
    public void doAnything() {
        System.out.println("doSomething method is called");
    }

}
