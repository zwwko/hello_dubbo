package loogx.java.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DubboAppConfigTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DubboAppConfig.class);
        System.out.println(ctx.getBean("resUniqueKeyService"));

        String[] names = ctx.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ":" + names[i]);
        }
    }
}