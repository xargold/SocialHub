package com.socialhub.dto;

public class CommentInputDTO {
    private String content;
    private Long postId;   // ID da publicação comentada
    private Long userId;   // ID do usuário que fez o comentário

    public CommentInputDTO(String content, Long postId, Long userId) {
        this.content = content;
        this.postId = postId;
        this.userId = userId;
    }

    // Getters e Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
