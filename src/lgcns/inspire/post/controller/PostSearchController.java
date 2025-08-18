package lgcns.inspire.post.controller;

import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.service.PostService;

public class PostSearchController {
    private PostService service;
    public PostSearchController() {

    }
    public PostSearchController(PostService service) {
        this.service = service;
    }
    // public List<PostResponseDTO> searchByWriter(String writer) {
    //     return service.searchService(writer);
    // }
    public Optional<List<PostResponseDTO>> searchByWriter(String writer) {
        System.out.println(">>> post controller search : params writer " + writer);
        return service.searchService(writer);
    }
}
