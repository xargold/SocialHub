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

        while (true) {
            System.out.println("Welcome to SocialHub!");
            System.out.println("1. Create User");
            System.out.println("2. View All Users");
            System.out.println("3. Create Post");
            System.out.println("4. View All Posts");
            System.out.println("5. Create Comment");
            System.out.println("6. View All Comments");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Limpar buffer

            switch (choice) {
                case 1:
                    userController.createUser(scanner);
                    break;
                case 2:
                    userController.viewAllUsers();
                    break;
                case 3:
                    postController.createPost(scanner);
                    break;
                case 4:
                    postController.viewAllPosts();
                    break;
                case 5:
                    commentController.createComment(scanner);
                    break;
                case 6:
                    commentController.viewAllComments();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
