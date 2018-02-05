package cn.monitor.service.impl;

import cn.monitor.domain.User;
import cn.monitor.service.CusService;
import cn.monitor.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author answer
 *         2018/2/5
 */
@Service
public class UserServeceImpl implements CusService{
    @Resource
    private UserService userService;

    @Override
    public void findUserInfo() {
        User user=userService.findUserInfo();
        System.out.println(user);
    }
}
