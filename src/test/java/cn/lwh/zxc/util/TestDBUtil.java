package cn.lwh.zxc.util;

import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import cn.lwh.zxc.TestSupport;

/**
 * @author luoweihong 
 * @date  2018年3月26日
 */
public class TestDBUtil extends TestSupport{
    
    @Test
    public void getasTest() throws IOException {
        Date usermapper =  super.getBean2(Date.class);
        System.out.println(usermapper);
    }
}
