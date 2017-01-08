package loogx.java.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboClientDubboXMLTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubboApp.xml");
        System.out.println(applicationContext.getBean("resUniqueKeyService"));
        String[] names = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ":" + names[i]);
        }
    }
}