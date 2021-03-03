package com.itmuch.usercenter.service.user;

import com.itmuch.usercenter.dao.user.UserMapper;
import com.itmuch.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类名: UserService
 * 描述: TODO
 * 姓名: 阿法
 * 日期: 2021-03-02 16:27
 **/
@Service
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
//为private final的变量自动注入
public class UserService {
    private final UserMapper userMapper;

    public User findById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
