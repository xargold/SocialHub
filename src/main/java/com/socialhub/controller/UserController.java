package com.socialhub.controller;

import com.socialhub.dto.UserInputDTO;
import com.socialhub.dto.UserOutputDTO;
import com.socialhub.service.UserService;

import java.util.Scanner;

public class UserController {
    private UserService userService = new UserService();
    private UserOutputDTO loggedInUser;

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

    public boolean login(Scanner scanner) {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        loggedInUser = userService.login(email, password);
        if (loggedInUser != null) {
            System.out.println("Login successful. Welcome, " + loggedInUser.getUsername() + "!");
            return true;
        } else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }

    public UserOutputDTO getLoggedInUser() {
        return loggedInUser;
    }
}
