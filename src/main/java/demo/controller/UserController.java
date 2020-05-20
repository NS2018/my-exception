package demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import demo.service.UserService;

import javax.validation.Valid;

@RestController
@Api(tags = "用户接口")
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("获取单个用户")
    @GetMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setId(1L);
        user.setAccount("123");
        user.setPassword("123");
        user.setEmail("123@qq.com");
        return null;
    }

    @ApiOperation("添加用户")
    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user){
        return userService.addUser(user);
    }


}
