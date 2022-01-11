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

@Controller
public class PostController {
    @GetMapping("/post-list")
    public String postlist(){
        return "post/list";
    }
}
