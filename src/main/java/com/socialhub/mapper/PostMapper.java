package com.socialhub.mapper;

import com.socialhub.dto.PostInputDTO;
import com.socialhub.dto.PostOutputDTO;
import com.socialhub.entity.Post;

public class PostMapper {

    public static Post toPost(PostInputDTO postInputDTO) {
        if (postInputDTO == null) {
            return null;
        }
        return new Post(null, postInputDTO.getTitle(), postInputDTO.getContent(), postInputDTO.getUserId());
    }

    public static PostOutputDTO toPostOutputDTO(Post post) {
        if (post == null) {
            return null;
        }
        return new PostOutputDTO(post.getId(), post.getTitle(), post.getContent(), post.getUserId());
    }
}
