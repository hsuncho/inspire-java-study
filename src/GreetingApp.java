public class GreetingApp {
    /*
    변수 선언 문법
    접근지정자(public, private) 타입 변수명;
    int age;

    변수의 타입(자료형)
    기본 타입 : 값을 담는 그릇
         - 숫자
             - 정수 : byte(1), short(2), int(4), long(8)
             - 실수 : float(4), double(8)
         - 문자 : char(2)
         - 문자열 : String
         - 논리 : boolean ( true | false )
    
    참조 타입 : 생성된 인스턴스의 주소값을 담는 그릇
          - 기본 타입이 아닌 모든 변수 타입
     
    메서드(method) : 행위 의미 (프로그램의 흐름 제어 또는 반복을 이용해서 로직 처리)
    접근지정자 반환타입(기본 | 참조 | void) 메서드명([매개변수]) {
    
    } 

    public void test() {

    }

    public 기본타입 | 참조타입 test() {

        return ;
    }

     */

     public static void main(String[] args) {
        // 지역 변수
        String msg = "즐거운 자바";
        System.out.println(msg);
     }
}
