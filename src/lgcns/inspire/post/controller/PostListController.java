package lgcns.inspire.post.controller;

import java.util.List;

import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.service.PostService;

public class PostListController {
    private PostService service;
    public PostListController() {

    }
    public PostListController(PostService service) {
        this.service = service;
    }
    public List<PostResponseDTO> list() {
        System.out.println(">>> post list controller list");
        return service.selectService();
    }
}
