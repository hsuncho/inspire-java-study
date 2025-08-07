public class VariableApp {
    
    public static void main(String[] args) {
        int age = 24;
        double height = 164;
        char gender = 'F';
        String name = "hsun";
        boolean isMarriage = false;

        // 변수를 사용해서 출력
        System.out.println(age);
        System.out.println(height);
        System.out.println(gender);
        System.out.println(name);
        System.out.println(isMarriage);

        // casting (), upCasting(자동), downCasting(연산자를 이용해서 강제로)
        // (타입) 변수명;
        byte x = 10, y = 10, sum = 0;
        sum = (byte) (x + y) ;
        System.err.println("연산한 결과는 : " + sum);

        char charVar01 = 'A', charVar02 = 'B';
        System.out.println(charVar01 + charVar02);
        System.out.println((char) 97);

        double doubleVar = 10.4;
        System.out.println(doubleVar);
    }
}
