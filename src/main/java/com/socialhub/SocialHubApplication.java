package com.socialhub;

import com.socialhub.controller.UserController;
import com.socialhub.controller.PostController;
import com.socialhub.controller.CommentController;
import java.util.Scanner;

public class SocialHubApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();
        PostController postController = new PostController();
        CommentController commentController = new CommentController();

        System.out.println("Welcome to SocialHub!");
        System.out.println("1. Create User");
        System.out.println("2. Login");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Clear buffer

        if (choice == 1) {
            userController.createUser(scanner);
        }

        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Please login to continue:");
            loggedIn = userController.login(scanner);
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create Post");
            System.out.println("2. View All Posts");
            System.out.println("3. Create Comment");
            System.out.println("4. View All Comments");
            System.out.println("5. Logout");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            switch (choice) {
                case 1:
                    postController.createPost(scanner, userController.getLoggedInUser());
                    break;
                case 2:
                    postController.viewAllPosts();
                    break;
                case 3:
                    commentController.createComment(scanner, userController.getLoggedInUser());
                    break;
                case 4:
                    commentController.viewAllComments();
                    break;
                case 5:
                    loggedIn = false;
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
