package lgcns.inspire.post.service;

import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.repository.PostDAO;

public class PostServiceImpl implements PostService{
    private PostDAO dao;
    public PostServiceImpl() {
        dao = new PostDAO();
    }
    @Override
    public List<PostResponseDTO> selectService() {
        System.out.println(">>> post service selectService");
        return dao.selectRow();
    }
    /*
    가져온 데이터로부터 식별값(id)에 만족하는 데이터를 반환할 때 Optional<PostResponseDTO>
    stream() 사용
    */
    @Override
    public Optional<PostResponseDTO> selectService(int id) {
        System.out.println(">>> post service selectService : params id");  
        List<PostResponseDTO> list = dao.selectRow();
        return list.stream()
                .filter(data -> data.getId() == id)
                .findAny();
    }
    // @Override
    // public int insertService(PostResponseDTO dto) {
    //     return dao.insertRow(dto);
    // }
    // @Override
    // public int getListSize() {
    //     return dao.getListSize();
    // }
    @Override
    public int insertService(PostRequestDTO request) {
        System.out.println(">>> post insertService : " + request);
        return dao.insertRow(request);    
    }
}
