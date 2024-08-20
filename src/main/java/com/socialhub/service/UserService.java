package com.socialhub.service;

import com.socialhub.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<UserDTO> users = new ArrayList<>();

    public void createUser(UserDTO userDTO) {
        users.add(userDTO);
        System.out.println("User created: " + userDTO.getUsername());
    }

    public List<UserDTO> getAllUsers() {
        return users;
    }
}
