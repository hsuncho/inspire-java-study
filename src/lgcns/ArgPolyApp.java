package lgcns;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class ArgPolyApp {
    private static PersonDTO [] perArr = new PersonDTO[10];
    private static int idx = 0;
    public static void main(String[] args) {
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
        setPerArr(student);
        setPerArr(teacher);
        printArr();
    }
    public static void setPerArr(PersonDTO element) {
        perArr[idx++] = element;
    }
    public static void printArr() {
        System.out.println(">>> 전체 출력");
        System.out.println();
        for(PersonDTO element : perArr) {
            if(element!=null) {
                System.out.println(element.personInfo());
            } else {
                break;
            }
        }
    }
}
