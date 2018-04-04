package cn.lwh.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lwh.zxc.pojo.UserDO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/applicationContext.xml"})
public class TestUserDao {
    
    
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    
    @Test
    public void getUserByUserIdTest() {
        
        
        SqlSession sqlsession = sqlSessionFactory.openSession();
        
        UserDao userDao = sqlsession.getMapper(UserDao.class);
        
        List<UserDO> list = userDao.getUserByUserId(1);
        if(null!=list&&list.size()>0) {
            System.out.println(list.get(0).toString());
        }else {
            System.out.println("不存在");
        }
        
    }

}
