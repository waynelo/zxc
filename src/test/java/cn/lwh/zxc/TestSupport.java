package cn.lwh.zxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSupport {
    private ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    
    public Object getBean(String beanid) {
        return context.getBean(beanid);
    }
    
}
