package com.socialhub.repository;

import com.socialhub.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<UserDTO> users = new ArrayList<>();

    public void save(UserDTO userDTO) {
        users.add(userDTO);
    }

    public List<UserDTO> findAll() {
        return users;
    }
}
