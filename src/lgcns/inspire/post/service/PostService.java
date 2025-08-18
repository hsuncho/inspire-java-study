package lgcns.inspire.post.service;

import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

public interface PostService {
    public List<PostResponseDTO> selectService();
    public Optional<PostResponseDTO> selectService(int id);
    // public int insertService(PostResponseDTO dto);
    public int insertService(PostRequestDTO request);
    // public int getListSize();
    // public List<PostResponseDTO> searchService(String writer);
    public Optional<List<PostResponseDTO>> searchService(String writer);
    public int deleteService(int id);
    public int updateService(PostRequestDTO request);
}