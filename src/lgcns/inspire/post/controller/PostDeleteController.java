package lgcns.inspire.post.controller;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> map = new HashMap<>();
        map.put("key", id);
        // return service.deleteService(id);
        return service.deleteService(map);
    }
}
