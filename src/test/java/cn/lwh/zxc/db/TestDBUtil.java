package cn.lwh.zxc.db;

import java.sql.Connection;

import org.junit.Test;


/**
 * 数据库连接测试
 * @author luoweihong 
 * @date  2018年4月4日
 */
public class TestDBUtil {
    @Test
    public void getConnectionTest() {
        Connection conn = DBUtil.getConnection();
        
        System.out.println(conn);
        
    }
}
