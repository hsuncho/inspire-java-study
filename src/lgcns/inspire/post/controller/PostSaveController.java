package lgcns.inspire.post.controller;

import lgcns.inspire.post.service.PostService;

public class PostSaveController {
    private PostService service;
    public PostSaveController () {

    }
    public PostSaveController (PostService service) {
        this.service = service;
    }

    public boolean save() {
        System.out.println(">>> post save controller save");
        return service.saveToFile();
    }
}
