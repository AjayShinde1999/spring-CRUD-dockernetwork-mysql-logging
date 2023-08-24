package com.springCURDdockernetworkmysqllogging.service.impl;

import com.springCURDdockernetworkmysqllogging.entity.User;
import com.springCURDdockernetworkmysqllogging.repository.UserRepository;
import com.springCURDdockernetworkmysqllogging.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User saveOneUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
       return userRepository.findAll();
    }

    @Override
    public User getById(Integer id) {
       return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user, Integer id) {
        User user1 = userRepository.findById(id).get();
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setEmail(user.getEmail());
        return userRepository.save(user1);
    }
}
