package cn.lwh.zxc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.lwh.zxc.pojo.UserDO;

@Repository
public interface UserDao {
    public List<UserDO> getUserByUsernameAndPassword(UserDO user);
    
    public List<UserDO> getUserByUserId(Integer id);
}
