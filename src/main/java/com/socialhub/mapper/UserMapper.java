package com.socialhub.mapper;

import com.socialhub.dto.UserInputDTO;
import com.socialhub.dto.UserOutputDTO;
import com.socialhub.entity.User;

public class UserMapper {

    // Converte UserInputDTO para User
    public static User toUser(UserInputDTO userInputDTO) {
        if (userInputDTO == null) {
            return null;
        }
        // Criação de uma nova instância de User com dados do UserInputDTO
        return new User(null, userInputDTO.getUsername(), userInputDTO.getEmail(), userInputDTO.getPassword());
    }

    // Converte User para UserOutputDTO
    public static UserOutputDTO toUserOutputDTO(User user) {
        if (user == null) {
            return null;
        }
        // Criação de uma nova instância de UserOutputDTO com dados do User
        return new UserOutputDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}
