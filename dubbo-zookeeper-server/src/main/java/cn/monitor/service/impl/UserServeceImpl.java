package cn.monitor.service.impl;

import cn.monitor.domain.User;
import cn.monitor.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author answer
 *         2018/2/5
 */
@Service
public class UserServeceImpl implements UserService{
    @Override
    public User findUserInfo() {
        User user=new User();
        user.setName("answer");
        user.setAge(24);
        return user;
    }
}
