package com.socialhub.controller;

import com.socialhub.dto.UserInputDTO;
import com.socialhub.dto.UserOutputDTO;
import com.socialhub.service.UserService;
import java.util.List;
import java.util.Scanner;

public class UserController {
    private UserService userService = new UserService();

    public void createUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        UserInputDTO userInputDTO = new UserInputDTO(username, email, password);
        userService.createUser(userInputDTO);
    }

    public void viewAllUsers() {
        List<UserOutputDTO> users = userService.getAllUsers();
        System.out.println("All users:");
        for (UserOutputDTO userOutputDTO : users) {
            System.out.println("ID: " + userOutputDTO.getId() + ", Username: " + userOutputDTO.getUsername() + ", Email: " + userOutputDTO.getEmail());
        }
    }
}
