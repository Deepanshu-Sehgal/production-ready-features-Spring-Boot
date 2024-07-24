package com.example.prod_ready_features.production_ready_features.services;

import com.example.prod_ready_features.production_ready_features.dto.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long postId);

    PostDTO updatePost(PostDTO inputPost, Long postId);
}