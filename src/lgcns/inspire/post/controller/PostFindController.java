package lgcns.inspire.post.controller;

import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.service.PostService;

public class PostFindController {
    private PostService service;
    public PostFindController () {

    }
    public PostFindController (PostService service) {
        this.service = service;
    }
    public Optional<PostResponseDTO> findPost(int id) {
        System.out.println(">>> post controller findPost : params " + id);
        return service.selectService(id);
    }
}
