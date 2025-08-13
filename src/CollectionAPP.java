import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class CollectionAPP {
    /*
    Collection API
    - List(중복허용, 순서존재, 객체를 요소로 갖는다, 가변길이)
    - Set(중복 x, 순서 x, 객체를 요소로 갖는다, 가변길이)

    - Map({ key : value })
    Wrapper Class
    - int -> Integer, char -> Characters
    */
    public static void main(String[] args) {
        System.out.println(">>> Array");
        int[] arr = new int[5];
        arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
        System.out.println(">>> legth : " + arr.length);
        arr[2] = 0;
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println(">>> List");

        //add(), get(), remove(), size()
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.toString());
        for(int idx=0; idx<list.size(); idx++) {
            int data = list.get(idx);
            System.out.println(data);
        }

        List<PersonDTO> perList = new ArrayList<PersonDTO>();
        TeacherDTO teacher = TeacherDTO.builder()
                            .name("임정섭")
                            .age(20)
                            .address("서울")
                            .subject("자바")
                            .build();
        StudentDTO student = StudentDTO.builder()
                            .name("hsuncho")
                            .age(24)
                            .address("서울")
                            .stuId("2025")
                            .build();
        perList.add(teacher);
        perList.add(student);
        for(int idx=0; idx<perList.size(); idx++) {
            System.out.println(perList.get(idx).personInfo());
        }

        System.out.println();
        System.out.println(">>> Set");
        Set<String> set = new HashSet<>();
        set.add("hsuncho"); set.add("inspire"); set.add("lgcns");
        // set.add("hsuncho"); // 중복허용 x
        System.out.println(set);
        Object [] setArr = set.toArray();
        for(Object value : setArr) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println(">>> Map");
        
        Map<String, List<? extends PersonDTO>> map = new HashMap<>();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(student);
        List<TeacherDTO> teacherList = new ArrayList<>();
        teacherList.add(teacher);

        map.put("student", studentList);
        map.put("teacher", teacherList);
        List<? extends PersonDTO> studentCollection = map.get("student");
        for(PersonDTO per : studentCollection) {
            System.out.println(per.personInfo());
        }
    }
}
