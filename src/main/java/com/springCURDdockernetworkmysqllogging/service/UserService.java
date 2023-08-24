package com.springCURDdockernetworkmysqllogging.service;

import com.springCURDdockernetworkmysqllogging.entity.User;

import java.util.List;

public interface UserService {

    public User saveOneUser(User user);

    public List<User> getAllUser();

    public User getById(Integer id);

    public void deleteUser(Integer id);

    public User updateUser(User user,Integer id);
}
