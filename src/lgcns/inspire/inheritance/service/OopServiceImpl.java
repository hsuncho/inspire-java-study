package lgcns.inspire.inheritance.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;
import lgcns.inspire.inheritance.util.Division;

/*
    ServiceImpl 이란 비즈니스 로직을 담당하는 객체
    - Tea, Stu 인스턴스 생성 및 배열 관리하는 역할
    - 프론트 쪽에 데이터 전달(배열) 
    - 프론트쪽에서 찾기 요청(객체)
*/

public class OopServiceImpl implements OopService{
    
    private PersonDTO [] arr;
    private int idx;
    private Map<String, PersonDTO> personMap;

    public OopServiceImpl() {
        arr = new PersonDTO[10];
        personMap = new HashMap<>();
    }
    @Override
    public void setMakePer(Division division, String name, int age, String address, String comm) {
    
        switch(division.getDivision()) {
            case "학생" :
                StudentDTO stu = StudentDTO.builder()
                                .name(name)
                                .age(age)
                                .address(address)
                                .stuId(comm)
                                .build();
                setPer(stu);
                break;
            case "강사" : 
                TeacherDTO tea = TeacherDTO.builder()
                                .name(name)
                                .age(age)
                                .address(address)
                                .subject(comm)
                                .build();
                setPer(tea);
                break;
        }

        // switch(division) {
        //     case STU :
        //         StudentDTO stu = StudentDTO.builder()
        //                         .name(name)
        //                         .age(age)
        //                         .address(address)
        //                         .stuId(comm)
        //                         .build();
        //         setPer(stu);
        //         break;
        //     case TEA :
        //         TeacherDTO tea = TeacherDTO.builder()
        //                         .name(name)
        //                         .age(age)
        //                         .address(address)
        //                         .subject(comm)
        //                         .build();
        //         setPer(tea); 
        //         break;
        // }
    }

    @Override
    public PersonDTO getFindPer(String name) {
        // for(PersonDTO data : arr) {
        //     if(data!= null && data.getName().equals(name)) {
        //         return data;
        //     }
        // }
        // return null;

        return personMap.get(name);

        // return Arrays.stream(arr)
        //             .filter(data -> data!= null && data.getName().equals(name))
        //             .findFirst()
        //             .orElse(null);
    }

    @Override
    public PersonDTO[] getArrPer() {
        return arr;
    }

    private void setPer(PersonDTO per) {
        arr[idx++] = per;
        personMap.put(per.getName(), per);
    }
    
}
