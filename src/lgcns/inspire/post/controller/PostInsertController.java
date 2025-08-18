package lgcns.inspire.post.controller;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.service.PostService;

public class PostInsertController {
    private PostService service;
    public PostInsertController() {

    }
    public PostInsertController(PostService service) {
        this.service = service;
    }
    public int insert(String title, String content, String writer) {
        System.out.println(">>> post insert controller insert params title : " + title);
        System.out.println(">>> post insert controller insert params content : " + content);
        System.out.println(">>> post insert controller insert params writer : " + writer);
        PostRequestDTO request = PostRequestDTO.builder()
                                                .id(service.selectService().size() + 1)
                                                .title(title)
                                                .writer(writer)
                                                .content(content)
                                                .build();
        return service.insertService(request);
    }
}
