package cn.lwh.zxc.dao.impl;

import org.springframework.stereotype.Repository;

import cn.lwh.zxc.dao.UserDao;
import cn.lwh.zxc.pojo.UserDO;

@Repository
public class UserDaoImpl implements UserDao {
    
    
    public UserDO login(UserDO user) {
        return new UserDO(1,"noah","123123");
    }

    public String name() {
        return "UserDaoImpl";
    }
    
}
