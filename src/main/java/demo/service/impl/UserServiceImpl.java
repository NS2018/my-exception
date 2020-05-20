package demo.service.impl;

import demo.model.User;
import org.springframework.stereotype.Service;
import demo.service.UserService;

/**
 * 用户业务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        return "success";
    }
}
