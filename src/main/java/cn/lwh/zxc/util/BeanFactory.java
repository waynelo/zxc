package cn.lwh.zxc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactory {
    private static ApplicationContext context;
    
    public static ApplicationContext getContext() {
        if(context == null) {
            context = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
        }
        return context;
    }
}
