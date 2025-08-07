package lgcns.inspire.operator;

public class Operator {
    
    // 객체 생성 시 멤버변수의 초기화를 도와주는 like a method
    public Operator() {
    }

    // 반환 값 x, 매개변수 x
    public void exmple01 () {
        System.out.println(">>> 산술 연산자 +, -, *, /, %");
        System.out.println(">>> 증감 연산자 ++, --");
        System.out.println(">>> 삼항 연산자 (조건식) ? true : false");
        System.out.println(">>> 논리 연산자 &, |, !, &&, ||");
        System.out.println(">>> 관계 연산자 >, >=, <, <=, ==, !=");
    }

    // 반환값 O, 매개변수 O
    public String example02(String str01, String str02) {
        return str01 + "\t" + str02;
    }

}
