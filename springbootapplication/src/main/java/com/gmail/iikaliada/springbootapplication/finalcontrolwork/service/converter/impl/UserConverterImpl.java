package com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.converter.impl;

import com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.model.User;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.converter.UserConverter;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.model.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserConverterImpl implements UserConverter {
    @Override
    public User fromDTO(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setPassword(userDTO.getPassword());
        user.setUsername(userDTO.getUsername());
        return user;
    }
}
