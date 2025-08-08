import lgcns.inspire.control.ControlDemo;

public class ControlApp {
    public static void main(String[] args) {
        ControlDemo app = new ControlDemo();
        String result =  app.woodMan(1);
        System.out.println(result);

        String switchResult = app.woodManSwitch(2);
        System.out.println(switchResult);

        String ternaryResult = app.woodManTernary(3);
        System.out.println(ternaryResult);

        String passResult = app.passOrNonPass(43, 80, 98);
        System.out.println(passResult);
    }
}
