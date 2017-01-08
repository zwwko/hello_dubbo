package loogx.java.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import uyun.pacific.model.api.service.ResUniqueKeyService;

import javax.annotation.Resource;

/**
 * Created by tt on 10/21/16.
 */
//@Component
@Service
public class DubboAnnotation {
    @Resource
    private FormAction formAction;

    public FormAction getFormAction() {
        return formAction;
    }


//    必需用dubbo:annotation,否则com.alibaba.dubbo.config.annotation.Reference不生效

    @Reference
    private ResUniqueKeyService resUniqueKeyService;

    public ResUniqueKeyService getResUniqueKeyService() {
        return resUniqueKeyService;
    }

}
                