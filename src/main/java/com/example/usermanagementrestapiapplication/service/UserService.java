package com.example.usermanagementrestapiapplication.service;

import com.example.usermanagementrestapiapplication.entify.User;
import com.example.usermanagementrestapiapplication.model.Dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDto> getListUser();
    public UserDto getUserById(int id);
}
