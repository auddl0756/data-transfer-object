package org.roon.dtos.web;

import lombok.RequiredArgsConstructor;
import org.roon.dtos.domain.post.Post;
import org.roon.dtos.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/posts")
@RestController
public class PostController {
    private final PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> getAllPost() {
        return ResponseEntity.ok().body(postService.getAll());
    }

    @GetMapping("/post")
    public ResponseEntity<Post> getOne(int id) {
        return ResponseEntity.ok().body(postService.getOne(id));
    }
}
