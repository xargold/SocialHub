package com.socialhub.service;

import com.socialhub.dto.UserInputDTO;
import com.socialhub.dto.UserOutputDTO;
import com.socialhub.entity.User;
import com.socialhub.repository.UserRepository;
import com.socialhub.mapper.UserMapper;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void createUser(UserInputDTO userInputDTO) {
        User user = UserMapper.toUser(userInputDTO);
        userRepository.save(user);
        System.out.println("User created: " + user.getUsername());
    }

    public UserOutputDTO login(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        if (user != null) {
            return UserMapper.toUserOutputDTO(user);
        } else {
            return null;
        }
    }

    public List<UserOutputDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                    .map(UserMapper::toUserOutputDTO)
                    .collect(Collectors.toList());
    }
}
