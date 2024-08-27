package com.socialhub.mapper;

import com.socialhub.dto.UserInputDTO;
import com.socialhub.dto.UserOutputDTO;
import com.socialhub.entity.User;

public class UserMapper {

    public static User toUser(UserInputDTO userInputDTO) {
        if (userInputDTO == null) {
            return null;
        }
        return new User(null, userInputDTO.getUsername(), userInputDTO.getEmail(), userInputDTO.getPassword());
    }

    public static UserOutputDTO toUserOutputDTO(User user) {
        if (user == null) {
            return null;
        }
        return new UserOutputDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}
