package cn.lwh.zxc.service;

import cn.lwh.zxc.pojo.UserDO;

public interface UserService {
    UserDO login(UserDO user);
    
    UserDO getUser(int id);
}
