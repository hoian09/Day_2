package beanscopes;

import org.example.Account;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public  static void main(String [] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscopes/beans.xml");
        Account accountSingleton1 =  applicationContext.getBean("account1", Account.class);
        accountSingleton1.setOwnerName("XXXXXXXXXXXX");
        Account accountSingleton2 =  applicationContext.getBean("account1", Account.class);
        System.out.println("account1 :" + accountSingleton2.getOwnerName());

        Account accountPrototype1 = applicationContext.getBean("account2", Account.class);
        accountPrototype1.setOwnerName("YYYYYYYYYYYY");
        Account accountPrototype2 = applicationContext.getBean("account2" , Account.class);
        System.out.println("account2 :" + accountPrototype2.getOwnerName());

    }
}
