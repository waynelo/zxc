package cn.lwh.zxc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserAction {
    
    @PostMapping(value ="userLogin")
    public String userLogin(@PathVariable("username") String username,@PathVariable("username") String password) {
        
        
        return "username"+ username + "<br>password"+password;
    }
}
