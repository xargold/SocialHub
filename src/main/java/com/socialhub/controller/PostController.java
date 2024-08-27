package com.socialhub.controller;

import com.socialhub.dto.PostInputDTO;
import com.socialhub.dto.PostOutputDTO;
import com.socialhub.service.PostService;
import com.socialhub.dto.UserOutputDTO;

import java.util.List;
import java.util.Scanner;

public class PostController {
    private PostService postService = new PostService();

    public void createPost(Scanner scanner, UserOutputDTO loggedInUser) {
        if (loggedInUser == null) {
            System.out.println("You must be logged in to create a post.");
            return;
        }

        System.out.print("Enter post content: ");
        String content = scanner.nextLine();

        PostInputDTO postInputDTO = new PostInputDTO(loggedInUser.getId(), content);
        postService.createPost(postInputDTO);
    }

    public void viewAllPosts() {
        List<PostOutputDTO> posts = postService.getAllPosts();
        System.out.println("All posts:");
        for (PostOutputDTO postOutputDTO : posts) {
            System.out.println("Post ID: " + postOutputDTO.getId() + ", Content: " + postOutputDTO.getContent() + ", User ID: " + postOutputDTO.getUserId());
        }
    }
}
