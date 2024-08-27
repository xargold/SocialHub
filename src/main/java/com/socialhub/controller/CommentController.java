package com.socialhub.controller;

import com.socialhub.dto.CommentInputDTO;
import com.socialhub.dto.UserOutputDTO;
import com.socialhub.service.CommentService;
import com.socialhub.service.PostService;

import java.util.Scanner;

public class CommentController {
    private CommentService commentService = new CommentService();
    private PostService postService = new PostService();

    public void createComment(Scanner scanner, UserOutputDTO loggedInUser) {
        if (loggedInUser == null) {
            System.out.println("You must be logged in to comment.");
            return;
        }

        postService.getAllPosts().forEach(post -> 
            System.out.println("Post ID: " + post.getId() + ", Content: " + post.getContent())
        );

        System.out.print("Enter post ID to comment on: ");
        Long postId = scanner.nextLong();
        scanner.nextLine();  // Clear buffer

        System.out.print("Enter comment content (max 255 characters): ");
        String content = scanner.nextLine();

        if (content.length() > 255) {
            System.out.println("Comment too long. Please try again.");
            return;
        }

        CommentInputDTO commentInputDTO = new CommentInputDTO(postId, loggedInUser.getId(), content);
        commentService.createComment(commentInputDTO);
    }

    public void viewAllComments() {
        commentService.getAllComments().forEach(comment -> 
            System.out.println("Comment ID: " + comment.getId() + ", Content: " + comment.getContent() + ", Post ID: " + comment.getPostId())
        );
    }
}
