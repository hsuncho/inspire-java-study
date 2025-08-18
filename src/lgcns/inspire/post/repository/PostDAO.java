package lgcns.inspire.post.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

/*
DAO(Data Access Object)
- db와의 작업을 담당하는 클래스
- 읽기(C), 읽기(R), 수정(U), 삭제(D) : CRUD
- Structure Query Language (SQL) : DDL, DML, DCL, Select Query
*/
public class PostDAO {
    private List<PostResponseDTO> posts;
    public PostDAO() {
        posts = new ArrayList<>(Arrays.asList(
            PostResponseDTO.builder()
                            .id(1)
                            .title("mvc")
                            .content("springboot")
                            .writer("hsuncho")
                            .build(),
            PostResponseDTO.builder()
                            .id(2)
                            .title("stream api")
                            .content("기초문법")
                            .writer("hsuncho")
                            .build(),
            PostResponseDTO.builder()
                            .id(3)
                            .title("lambda")
                            .content("함수형 인터페이스")
                            .writer("lgcns")
                            .build(),
            PostResponseDTO.builder()
                            .id(4)
                            .title("springboot")
                            .content("pattern 조합")
                            .writer("inspire")
                            .build()
        ));
    }

    public int getListSize() {
        return posts.size();
    }

    // C
    // public int insertRow(PostResponseDTO request) {
    //     System.out.println(">>> dao insertRow");
    //     return posts.add(request) ? 1 : 2;
    // }

    public int insertRow(PostRequestDTO request) {
        System.out.println(">>> dao insertRow");
        return posts.add(PostRequestDTO.toResponseDTO(request)) ? 1 : 2;
    }

    // R (전체 조회)
    public List<PostResponseDTO> selectRow() {
        System.out.println(">>> dao selectRow");
        // 데이터베이스 연동 후 값을 가져온다고 가정하고 더미데이터를 생성
        // 초기 데이터 생성
        return posts;
    }

    // R (조건에 만족하는 검색)
    // SQL : select * from table where id = ?;
    // public PostResponseDTO selectRow(String id) {
    //     System.out.println(">>> dao selectRow id");
    //     return null;
    // }

    // U (수정)
    public int updateRow(PostRequestDTO request) {
        System.out.println(">>> dao updateRow");
        return posts.stream() 
                    .filter(post -> post.getId() == request.getId())
                    .findFirst()
                    .map(post -> {
                        posts.set(posts.indexOf(post), 
                            PostResponseDTO.builder()
                                            .id(post.getId())
                                            .writer(post.getWriter())
                                            .title(request.getTitle())
                                            .content(request.getContent())
                                            .build()
                        );
                    return 1;
                    })
                    .orElse(0);
        
    }

    // D (삭제)
    public int deleteRow(int id) {
        System.out.println(">>> dao deleteRow id");
        return posts.removeIf(post -> post.getId() == id) ? 1 : 0;
    }
}