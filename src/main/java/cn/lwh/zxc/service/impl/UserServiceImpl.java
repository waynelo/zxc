package cn.lwh.zxc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwh.zxc.dao.UserDao;
import cn.lwh.zxc.pojo.UserDO;
import cn.lwh.zxc.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private List<UserDao> userDao;
    
/*    public User login(User user) {
        return userDao.login(user);
    }*/
    
    public String name() {
        
        
        return Integer.toString(userDao.size());
    }

    public UserDO login(UserDO user) {
        return null;
    }
    
}
