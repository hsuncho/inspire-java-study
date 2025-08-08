import lgcns.inspire.still.StaticDemo;

public class StaticApp {
    public static void main(String[] args) {

        StaticDemo.staticVar = 10;
        System.out.println(StaticDemo.staticVar);

        StaticDemo.staticVar = 20;
        System.out.println(StaticDemo.staticVar);

        // error
        // StaticDemo.CONSTVAR = 20; // 이 줄은 컴파일 에러 발생 (final 변수 변경 불가)

        StaticDemo app = new StaticDemo();
        app.nonStaticMethod();

        StaticDemo.staticMethod();
    }
}
