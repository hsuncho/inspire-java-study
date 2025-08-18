package lgcns.inspire.post.controller;

import lgcns.inspire.post.service.PostService;

public class PostDeleteController {
    private PostService service;
    public PostDeleteController() {

    }
    public PostDeleteController(PostService service) {
        this.service = service;
    }
    public int delete(int id) {
        System.out.println(">>> post delete controller delete params id : " + id);
        return service.deleteService(id);
    }
}
