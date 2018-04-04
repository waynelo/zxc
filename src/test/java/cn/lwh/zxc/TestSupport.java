package cn.lwh.zxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSupport {
    private ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
    
    public Object getBean(String beanid) {
        return context.getBean(beanid);
    }
    public <T> T getBean2(Class<T> c){
        return context.getBean(c);
    }
    
}
