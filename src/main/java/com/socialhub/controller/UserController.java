package com.socialhub.controller;

import com.socialhub.dto.UserDTO;
import com.socialhub.service.UserService;
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

        UserDTO userDTO = new UserDTO(username, email, password);
        userService.createUser(userDTO);
    }

    public void viewAllUsers() {
        System.out.println("All users:");
        for (UserDTO userDTO : userService.getAllUsers()) {
            System.out.println("Username: " + userDTO.getUsername() + ", Email: " + userDTO.getEmail());
        }
    }
}
