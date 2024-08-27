package com.socialhub;

import com.socialhub.controller.UserController;
import java.util.Scanner;

public class SocialHubApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();
        
        while (true) {
            System.out.println("Welcome to SocialHub!");
            System.out.println("1. Create User");
            System.out.println("2. View All Users");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    userController.createUser(scanner);
                    break;
                case 2:
                    userController.viewAllUsers();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
