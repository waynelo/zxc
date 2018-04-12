package cn.lwh.zxc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.lwh.zxc.pojo.UserDO;
import cn.lwh.zxc.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserAction {
    
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public String userLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("asdasdasdasddasfasd***********88");
        UserDO user = new UserDO();
        user.setUsername(username);
        user.setPassword(password);
        user = userService.login(user);
        if(null != user) {
            return "userid:" + user.getId() + "<br>gender:" + user.getGender();
        }else {
            return "用户不存在";
        }
        
    }
    
}
