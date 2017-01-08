package loogx.java.dubbo;

import loogx.java.dubbo.service.DubboAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboClientAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");

        String[] names = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ":" + names[i]);
        }
//        System.out.println(applicationContext.getBean("dubboAnnotation"));
        DubboAnnotation dubboAnnotation = applicationContext.getBean(DubboAnnotation.class,"dubboAnnotation");

        System.out.println(dubboAnnotation.getFormAction());
        System.out.println(dubboAnnotation.getResUniqueKeyService());

    }
}