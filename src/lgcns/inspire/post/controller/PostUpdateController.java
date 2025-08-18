package lgcns.inspire.post.controller;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.service.PostService;

public class PostUpdateController {
    private PostService service;
    public PostUpdateController() {

    }
    public PostUpdateController(PostService service) {
        this.service = service;
    }
    public int update(int id, String title, String content) {
        System.out.println(">>> post update controller update params id : " + id);
        System.out.println(">>> post update controller update params title : " + title);
        System.out.println(">>> post update controller update params content : " + content);
        PostRequestDTO request = PostRequestDTO.builder()
                                                .id(id)
                                                .title(title)
                                                .content(content)
                                                .build();
        return service.updateService(request);
    }
}
