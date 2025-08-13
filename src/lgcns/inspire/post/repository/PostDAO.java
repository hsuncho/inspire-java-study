package lgcns.inspire.post.repository;

import java.util.List;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

/*
DAO(Data Access Object)
- db와의 작업을 담당하는 클래스
- 읽기(C), 읽기(R), 수정(U), 삭제(D) : CRUD
- Structure Query Language (SQL) : DDL, DML, DCL, Select Query
*/
public class PostDAO {
    // C
    public int insertRow(PostRequestDTO request) {
        System.out.println(">>> dao insertRow");
        return 0;
    }
    // R (전체 조회)
    public List<PostResponseDTO> selectRow() {
        System.out.println(">>> dao selectRow");
        return null;
    }
    // R (조건에 만족하는 검색)
    public PostResponseDTO selectRow(String id) {
        System.out.println(">>> dao selectRow id");
        return null;
    }
    // U (수정)
    public int updateRow(PostRequestDTO request) {
        System.out.println(">>> dao updateRow");
        return 0;
    }
    // D (삭제)
    public int deleteRow(String id) {
        System.out.println(">>> dao deleteRow id");
        return 0;
    }
}