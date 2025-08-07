package lgcns;

public class Teacher {
    
    public String name;
    public double height;
    public int age;
    public String mbti;
    public String birthPlace;
    public boolean isMarriage;

    /*
        생성자 : Constructor
        - like method
        - 반환 타입 x, 메서드의 이름이 클래스 이름과 동일
        - 일반 메서드처럼 호출 불가, 객체 생성 시 호출
        - 인자 없는 생성자를 기본 생성자, 인자 있는 생성자를 스페셜 생성자
        - 여러 개의 생성자가 인자의 숫자와 타입을 달리 해서 정의되는 것을 생성자 오버로딩
        - 역할: 멤버변수를 초기화
    */

    public Teacher() {

    }
    
    public Teacher(String name, double height, int age, String mbti, String birthPlace, boolean isMarriage) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.mbti = mbti;
        this.birthPlace = birthPlace;
        this.isMarriage = isMarriage;
    }
    
    

}
