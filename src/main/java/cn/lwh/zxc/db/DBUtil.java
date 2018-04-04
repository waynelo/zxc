package cn.lwh.zxc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库链接
 * @author luoweihong 
 * @date  2018年4月4日
 */
public class DBUtil {
    public static Connection getConnection(){
        Connection conn = null;
        
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
        }  
        catch (ClassNotFoundException ex)  
        {  
            System.out.println("加载驱动程序有错误");  
        }
        
        String url = "jdbc:mysql://localhost:3306/zxc?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&user=root&password=0000";
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("成功连接数据库！！");
        } catch (SQLException e) {
            System.out.println("取得连接的时候有错误，请核对用户名和密码");
            e.printStackTrace();
        }
        
        return conn;
    }
}
