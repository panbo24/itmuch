package com.itmuch.usercenter;

import com.itmuch.usercenter.dao.user.UserMapper;
import com.itmuch.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 类名: TestController
 * 描述: TODO
 * 姓名: 阿法
 * 日期: 2021-02-08 15:36
 **/
@RestController
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class TestController {
    private UserMapper userMapper;
    @GetMapping("/test")
    public User testInsert() {
        User user = new User();
        user.setAvatarUrl("XXX");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);

        return user;

    }
}
