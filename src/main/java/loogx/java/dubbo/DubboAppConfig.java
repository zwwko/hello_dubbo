package loogx.java.dubbo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by tt on 10/21/16.
 * 注意：用ContextConfiguration,dubbo引用无法注入！！！
 */
@Configuration
//@ContextConfiguration(locations = {"classpath:**/dubboApp.xml"})
@ImportResource("classpath:**/dubboApp.xml")
//@ComponentScan("uyun.crab.model")dubbo只能通过dubbo:annotation
public class DubboAppConfig {
}
                