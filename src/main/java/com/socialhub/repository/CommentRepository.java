package com.socialhub.repository;

import com.socialhub.entity.Comment;
import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private List<Comment> comments = new ArrayList<>();

    public void save(Comment comment) {
        comments.add(comment);
    }

    public List<Comment> findAll() {
        return comments;
    }
}
