import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.service.OopService;
import lgcns.inspire.inheritance.service.OopServiceImpl;
import lgcns.inspire.inheritance.util.Division;

public class OopFrontApp {
    public static void main(String[] args) {
        OopService service = new OopServiceImpl();
        System.out.println(">>> 객체 생성을 요구");
        service.setMakePer(Division.STU, "hsuncho", 24, "동대문구", "2025");
        service.setMakePer(Division.TEA, "jslim", 20, "송파구", "자바");

        System.out.println();
        System.out.println(">>> 전체 출력");
        PersonDTO [] arr = service.getArrPer();
        for(PersonDTO data : arr) {
            if (data == null) break;
            System.out.println(data.personInfo());
        }

        PersonDTO findObj = service.getFindPer("none");
        if(findObj == null) {
            System.out.println(">>> 데이터 찾기 실패!");
        } else {
            System.out.println(findObj.personInfo());
        }
    }
}
