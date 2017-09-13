package com.jk.service;


import com.jk.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserService {

    public List<User> userList() throws  Exception;

    public void deleteUser(User user) throws  Exception;

    public void addUser(User user) throws  Exception;

}
