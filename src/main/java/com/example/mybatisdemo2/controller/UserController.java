package com.example.mybatisdemo2.controller;

import com.example.mybatisdemo2.model.UserDomain;
import com.example.mybatisdemo2.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public int addUser( @RequestBody UserDomain user){
        return userService.addUser(user);
    }

    @PostMapping("/delete")
    public int deleteUser( @RequestParam int userId){
        return  userService.deleteUser(userId);
    }

    @GetMapping("/selectById")
    public UserDomain selectById( @RequestParam int userId){
        return  userService.selectById(userId);
    }

    @PostMapping("/update")
    public int updateUser(@RequestBody UserDomain update,@RequestParam int userId){
        UserDomain old=userService.selectById(userId);
        old.setUserName(update.getUserName());
        old.setPassword(update.getPassword());
        old.setPhone(update.getPhone());
        old.setUserId(userId);
        return  userService.updateUser(old);
    }

    @GetMapping("/selectAll")
    public List<UserDomain> selectAll( ){
        return  userService.selectAll();
    }

}
