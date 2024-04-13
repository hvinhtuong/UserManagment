package com.example.usermanagementrestapiapplication.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.usermanagementrestapiapplication.entify.User;
import com.example.usermanagementrestapiapplication.model.Dto.UserDto;
import com.example.usermanagementrestapiapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ResponseEntity<?> getListUser() {
        List<UserDto> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/search")
    public ResponseEntity<?> searchUser(@RequestParam(name = "keyword", required = false, defaultValue = "") String name) {
        List<UserDto> users = userService.searchUser(name);
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        UserDto result = userService.getUserById(id);
        return ResponseEntity.ok(result);
    }
    @PostMapping ("")
    public ResponseEntity<?> createUser() {
        return null;
    }
    @PutMapping ("/{id}")
    public ResponseEntity<?> updateUser() {
        return null;
    }
    @DeleteMapping  ("/{id}")
    public ResponseEntity<?> deleteUser() {
        return null;
    }
}
