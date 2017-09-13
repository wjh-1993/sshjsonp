package com.jk.dao;

import com.jk.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from sys_permission")
    public List<User> userList() throws  Exception;

    @Delete("delete from sys_permission where pid=#{pid}")
    public void deleteUser(User user) throws  Exception;

    @Insert("insert into sys_permission (pname,type,url,parentid) values (#{pname},#{type},#{url},#{parentid})")
    public void addUser(User user) throws  Exception;


}
