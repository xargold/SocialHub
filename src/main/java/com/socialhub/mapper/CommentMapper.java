package com.socialhub.mapper;

import com.socialhub.dto.CommentInputDTO;
import com.socialhub.dto.CommentOutputDTO;
import com.socialhub.entity.Comment;

public class CommentMapper {

    public static Comment toComment(CommentInputDTO commentInputDTO) {
        if (commentInputDTO == null) {
            return null;
        }
        return new Comment(null, commentInputDTO.getContent(), commentInputDTO.getPostId(), commentInputDTO.getUserId());
    }

    public static CommentOutputDTO toCommentOutputDTO(Comment comment) {
        if (comment == null) {
            return null;
        }
        return new CommentOutputDTO(comment.getId(), comment.getContent(), comment.getPostId(), comment.getUserId());
    }
}
