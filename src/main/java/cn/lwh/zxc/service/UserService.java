package cn.lwh.zxc.service;

import cn.lwh.zxc.pojo.UserDO;

public interface UserService {
    
    /**
     * 对登录用户进行验证
     * @Description: TODO 对登录用户进行验证
     * @param @param user 用户的登录信息
     * @return UserDO  用户完整信息
     */
    UserDO login(UserDO user);
    
    UserDO getUser(int id);
}
