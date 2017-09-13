package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.model.User;
import com.jk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("userService")
@Transactional(readOnly = true,propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList() throws Exception {
        return userMapper.userList();
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteUser(User user) throws Exception {
        userMapper.deleteUser(user);
    }

    @Override
    @Transactional(readOnly = false)
    public void addUser(User user) throws Exception {
        userMapper.addUser(user);
    }
}
