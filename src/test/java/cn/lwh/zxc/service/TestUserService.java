package cn.lwh.zxc.service;

import org.junit.Test;

import cn.lwh.zxc.TestSupport;

public class TestUserService extends TestSupport {
    
    
    @Test
    public void loginTset() {
        UserService userService = (UserService)super.getBean("userServiceImpl");
        System.out.println(userService.name());
    }
}
