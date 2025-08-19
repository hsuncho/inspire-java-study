package lgcns.inspire.post.factory;

import java.util.HashMap;
import java.util.Map;

import lgcns.inspire.post.controller.PostDeleteController;
import lgcns.inspire.post.controller.PostFindController;
import lgcns.inspire.post.controller.PostInsertController;
import lgcns.inspire.post.controller.PostListController;
import lgcns.inspire.post.controller.PostSaveController;
import lgcns.inspire.post.controller.PostSearchController;
import lgcns.inspire.post.controller.PostUpdateController;
import lgcns.inspire.post.service.PostService;
import lgcns.inspire.post.service.PostServiceImpl;

/*
Singleton Pattern
- 인스턴스를 하나로 유지하는 방법(무분별한 객체 생성을 방지) : Inversion of Control(IoC)
- 문법)
    - 생성자의 접근제어자 private
    - 자신의 타입을 반환하는 메서드를 static
*/
public class BeanFactory {
    private static BeanFactory instance;
    private Map<String, Object> map;
    private PostService service;
    private BeanFactory() {
        service = new PostServiceImpl();
        map = new HashMap<>();
        map.put("list", new PostListController(service));
        map.put("find", new PostFindController(service));
        map.put("insert", new PostInsertController(service));
        map.put("delete", new PostDeleteController(service));
        map.put("update", new PostUpdateController(service));
        map.put("searchByWriter", new PostSearchController(service));
        map.put("save", new PostSaveController(service));
    }
    public static BeanFactory getInstance() {
        if(instance == null) {
            instance = new BeanFactory();
        }
        return instance;
    }
    public Object getController(String requestURL) {
        return map.get(requestURL);
    }
}
