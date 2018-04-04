package cn.lwh.zxc.dao;

import java.util.List;

import cn.lwh.zxc.pojo.UserDO;

public interface UserDao {
    public List<UserDO> getUserByUsernameAndPassword(UserDO user);
    
    public List<UserDO> getUserByUserId(Integer id);
}
