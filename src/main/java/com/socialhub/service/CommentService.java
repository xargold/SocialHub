package com.socialhub.service;

import com.socialhub.dto.CommentInputDTO;
import com.socialhub.dto.CommentOutputDTO;
import com.socialhub.entity.Comment;
import com.socialhub.mapper.CommentMapper;
import com.socialhub.repository.CommentRepository;
import java.util.List;
import java.util.stream.Collectors;

public class CommentService {
    private CommentRepository commentRepository = new CommentRepository();

    public void createComment(CommentInputDTO commentInputDTO) {
        Comment comment = CommentMapper.toComment(commentInputDTO);
        commentRepository.save(comment);
        System.out.println("Comment created on post " + comment.getPostId() + " by user " + comment.getUserId());
    }

    public List<CommentOutputDTO> getAllComments() {
        List<Comment> comments = commentRepository.findAll();
        return comments.stream()
                       .map(CommentMapper::toCommentOutputDTO)
                       .collect(Collectors.toList());
    }
}
