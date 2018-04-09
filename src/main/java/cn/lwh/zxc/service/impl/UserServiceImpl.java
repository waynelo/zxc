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
    private UserDao userDao;
    
    public UserDO login(UserDO user) {
        List<UserDO> list = userDao.getUserByUsernameAndPassword(user);
        if(null != list && list.size() > 0) {
            return list.get(0);
        }else {
            return null;
        }
    }
    
    public UserDO getUser(int id) {
        List<UserDO> list = userDao.getUserByUserId(id);
        if(null != list && list.size() > 0) {
            return list.get(0);
        }else {
            return null;
        }
    }
}