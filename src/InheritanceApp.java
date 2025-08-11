import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class InheritanceApp {
    public static void main(String[] args) {
        // 강사 객체 생성
        // PersonDTO teacher = PersonDTO.builder()
        //                     .name("임섭순")
        //                     .age(20)
        //                     .address("서울")
        //                     .subject("자바")
        //                     .build();
        // System.out.println(">>> tea : " + teacher);
        // PersonDTO student = PersonDTO.builder()
        //                     .name("hsuncho")
        //                     .age(24)
        //                     .address("서울")
        //                     .stuId("2025")
        //                     .build();
        // System.out.println(">>> stu : " + student);

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
        
        // 다형성(polymorphism)
        // PersonDTO tea = new TeacherDTO();
        // PersonDTO stu = new StudentDTO();

        // instanceof 연산자: 런타임 시점에 타입을 체크해주는 논리연산자
        PersonDTO [] arr = new PersonDTO[10];
        arr[0] = teacher;
        arr[1] = student;

        for(int idx = 0; idx < arr.length; idx++) {
            PersonDTO person = arr[idx];
            // if(person == null) {
            //     break;
            // } else if(person instanceof StudentDTO) {
            //     System.out.println(((StudentDTO)person).studentInfo());;
            // } else if(person instanceof TeacherDTO) {
            //     System.out.println(((TeacherDTO)person).teacherInfo());;
            // }
            if(person == null) {
                break;
            } else {
                System.out.println(person.personInfo());
            }
        }
    }
}
