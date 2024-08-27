package com.socialhub.service;

import com.socialhub.dto.UserInputDTO;
import com.socialhub.dto.UserOutputDTO;
import com.socialhub.entity.User; // Supondo que você tenha uma classe User como entidade
import com.socialhub.repository.UserRepository;
import com.socialhub.mapper.UserMapper; // Supondo que você tenha um mapper para conversão

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void createUser(UserInputDTO userInputDTO) {
        User user = UserMapper.toUser(userInputDTO);
        userRepository.save(user);
        System.out.println("User created: " + user.getUsername());
    }

    public List<UserOutputDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                    .map(UserMapper::toUserOutputDTO)
                    .collect(Collectors.toList());
    }
}
