package com.example.usermanagementrestapiapplication.service;

import com.example.usermanagementrestapiapplication.entify.User;
import com.example.usermanagementrestapiapplication.model.Dto.UserDto;
import com.example.usermanagementrestapiapplication.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    private static ArrayList<User> user = new ArrayList<User>();
    static {
        user.add(new User(1, "Ho Vinh Tuong", "hvinhtuong@gmail.com", "0333090869", "avatar1.img", "240397"));
        user.add(new User(2, "Bui Minh Bao Tran", "baotran0212@gmail.com", "0368306399", "avatar2.img", "021297"));
    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user : user) {
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }
}
