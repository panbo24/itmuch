package com.itmuch.usercenter.controller.user;

import com.itmuch.usercenter.domain.entity.user.User;
import com.itmuch.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 类名: UserController
 * 描述: TODO
 * 姓名: 阿法
 * 日期: 2021-03-02 16:38
 **/
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return this.userService.findById(id);
    }

}
