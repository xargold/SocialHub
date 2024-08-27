package com.socialhub.service;

import com.socialhub.dto.PostInputDTO;
import com.socialhub.dto.PostOutputDTO;
import com.socialhub.entity.Post;
import com.socialhub.mapper.PostMapper;
import com.socialhub.repository.PostRepository;
import java.util.List;
import java.util.stream.Collectors;

public class PostService {
    private PostRepository postRepository = new PostRepository();

   public void createPost(PostInputDTO postInputDTO) {
        Post post = PostMapper.toPost(postInputDTO);
        postRepository.save(post);
        System.out.println("Post created by user " + post.getUserId());
    }

    public List<PostOutputDTO> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
                    .map(PostMapper::toPostOutputDTO)
                    .collect(Collectors.toList());
    }
}
