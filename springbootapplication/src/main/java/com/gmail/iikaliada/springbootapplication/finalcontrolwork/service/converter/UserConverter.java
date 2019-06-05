package com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.converter;

import com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.model.User;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.model.UserDTO;

public interface UserConverter {

    User fromDTO(UserDTO userDTO);
}
