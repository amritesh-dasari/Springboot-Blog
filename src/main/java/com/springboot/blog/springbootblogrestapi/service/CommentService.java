package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.payload.CommentDto;

public interface CommentService {
    CommentDto creatComment(long postId, CommentDto commentDto);
}
