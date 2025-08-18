package lgcns.inspire.post.front;

import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.controller.PostDeleteController;
import lgcns.inspire.post.controller.PostFindController;
import lgcns.inspire.post.controller.PostInsertController;
import lgcns.inspire.post.controller.PostListController;
import lgcns.inspire.post.controller.PostSearchController;
import lgcns.inspire.post.controller.PostUpdateController;
import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.factory.BeanFactory;

public class FrontController {
    private BeanFactory factory;
    public FrontController() {
        factory = BeanFactory.getInstance();
    }

    public List<PostResponseDTO> list(String reqeuestURL) {
        System.out.println(">>> front controller list");
        PostListController obj = (PostListController) factory.getController(reqeuestURL);
        return obj.list();
    }

    public Optional<PostResponseDTO> findPost(String requestURL, int id) {
        System.out.println(">>> front controller findPost params : " + id);
        PostFindController obj = (PostFindController) factory.getController(requestURL);
        return obj.findPost(id);
    }

    public int insert(String requestURL, String title, String content, String writer) {
        System.out.println(">>> front controller insert params : " + title);
        System.out.println(">>> front controller insert params : " + content);
        System.out.println(">>> front controller insert params : " + writer);
        
        PostInsertController obj = (PostInsertController) factory.getController(requestURL);
        return obj.insert(title, content, writer);
    }

    public int delete(String requestURL, int id) {
        System.out.println(">>> front controller insert params : " + id);
        PostDeleteController obj = (PostDeleteController)factory.getController(requestURL);
        return obj.delete(id);
    }

    public int update(String requestURL, int id, String title, String content) {
        System.out.println(">>> front controller update params : " + id);
        System.out.println(">>> front controller update params : " + title);
        System.out.println(">>> front controller update params : " + content);

        PostUpdateController obj = (PostUpdateController) factory.getController(requestURL);
        return obj.update(id, title, content);
    }

    // public List<PostResponseDTO> searchByWriter(String requestURL, String writer) {
    //     PostSearchController obj = (PostSearchController) factory.getController(requestURL);
    //     return obj.searchByWriter(writer);
    // }
    public Optional<List<PostResponseDTO>> searchByWriter(String requestURL, String writer) {
        System.out.println(">>> front controller search params " + writer);
        PostSearchController obj = (PostSearchController) factory.getController(requestURL);
        return obj.searchByWriter(writer);
    }
}
