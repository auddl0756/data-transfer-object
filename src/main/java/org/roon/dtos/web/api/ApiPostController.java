package org.roon.dtos.web.api;

import lombok.RequiredArgsConstructor;
import org.roon.dtos.domain.post.Post;
import org.roon.dtos.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/posts")
@RestController
public class ApiPostController {
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
