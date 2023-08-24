package com.springCURDdockernetworkmysqllogging.controller;

import com.springCURDdockernetworkmysqllogging.entity.User;
import com.springCURDdockernetworkmysqllogging.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User user1 = userService.saveOneUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
       return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Integer id){
        User user = userService.getById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOneUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateOneUser(@RequestBody User user, @PathVariable Integer id){
        User user1 = userService.updateUser(user, id);
        return new ResponseEntity<>(user1,HttpStatus.OK);
    }
}
