package com.socialhub.repository;

import com.socialhub.entity.Post;
import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    private List<Post> posts = new ArrayList<>();

    public void save(Post post) {
        posts.add(post);
    }

    public List<Post> findAll() {
        return posts;
    }
}
