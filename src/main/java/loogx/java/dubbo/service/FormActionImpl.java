package loogx.java.dubbo.service;

import org.springframework.stereotype.Component;

/**
 * Created by tt on 1/8/17.
 */
@Component
public class FormActionImpl implements FormAction {
    @Override
    public void docaction() {
        System.out.println("docaction");
    }
}
