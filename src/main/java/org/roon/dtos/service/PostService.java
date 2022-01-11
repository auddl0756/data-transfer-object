package org.roon.dtos.service;

import lombok.RequiredArgsConstructor;
import org.roon.dtos.domain.post.Post;
import org.roon.dtos.domain.post.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getAll() {
        return postRepository.findAll();
    }

    public Post getOne(int id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id = " + id + "인 유저 없음."));
    }
}
