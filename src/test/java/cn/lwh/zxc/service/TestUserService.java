package cn.lwh.zxc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lwh.zxc.pojo.UserDO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/applicationContext.xml"})
public class TestUserService {
    
    @Autowired
    private UserService userService;
    
    @Test
    public void loginTset() {
        UserDO user = userService.getUser(1);
        if(user!=null) {
            System.out.println(user);
        }else {
            System.out.println("又错了啊");
        }
        
    }
}
