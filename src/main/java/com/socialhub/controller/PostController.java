package com.socialhub.controller;

import com.socialhub.dto.PostInputDTO;
import com.socialhub.dto.PostOutputDTO;
import com.socialhub.service.PostService;
import java.util.List;
import java.util.Scanner;

public class PostController {
    private PostService postService = new PostService();

    public void createPost(Scanner scanner) {
        System.out.print("Enter post title: ");
        String title = scanner.nextLine();
        System.out.print("Enter post content: ");
        String content = scanner.nextLine();
        System.out.print("Enter user ID: ");
        Long userId = scanner.nextLong();
        scanner.nextLine();

        PostInputDTO postInputDTO = new PostInputDTO(title, content, userId);
        postService.createPost(postInputDTO);
    }

    public void viewAllPosts() {
        List<PostOutputDTO> posts = postService.getAllPosts();
        System.out.println("All posts:");
        for (PostOutputDTO postOutputDTO : posts) {
            System.out.println("ID: " + postOutputDTO.getId() + ", Title: " + postOutputDTO.getTitle() + ", User ID: " + postOutputDTO.getUserId());
        }
    }
}
