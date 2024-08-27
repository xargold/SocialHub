package com.socialhub.controller;

import com.socialhub.dto.CommentInputDTO;
import com.socialhub.dto.CommentOutputDTO;
import com.socialhub.service.CommentService;
import java.util.List;
import java.util.Scanner;

public class CommentController {
    private CommentService commentService = new CommentService();

    public void createComment(Scanner scanner) {
        System.out.print("Enter comment content: ");
        String content = scanner.nextLine();
        System.out.print("Enter post ID: ");
        Long postId = scanner.nextLong();
        System.out.print("Enter user ID: ");
        Long userId = scanner.nextLong();
        scanner.nextLine();  // Limpar buffer

        CommentInputDTO commentInputDTO = new CommentInputDTO(content, postId, userId);
        commentService.createComment(commentInputDTO);
    }

    public void viewAllComments() {
        List<CommentOutputDTO> comments = commentService.getAllComments();
        System.out.println("All comments:");
        for (CommentOutputDTO commentOutputDTO : comments) {
            System.out.println("ID: " + commentOutputDTO.getId() + ", Content: " + commentOutputDTO.getContent() + ", Post ID: " + commentOutputDTO.getPostId() + ", User ID: " + commentOutputDTO.getUserId());
        }
    }
}
