package com.example.usermanagementrestapiapplication.model.mapper;

import com.example.usermanagementrestapiapplication.entify.User;
import com.example.usermanagementrestapiapplication.model.Dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user){
        UserDto tmp = new UserDto();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setPhone(user.getPhone());
        tmp.setEmail(user.getEmail());
        tmp.setAvatar(user.getAvatar());
        return tmp;
    }
}
