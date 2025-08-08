import lgcns.inspire.loop.LoopDemo;

public class LoopApp {
    public static void main(String[] args) {

        LoopDemo app = new LoopDemo();
        int sum = app.sumOneToTen(1, 10);
        System.out.println("sum = " + sum);
        app.sumRandom();
        app.loopBreak(100);
        app.loopBreakWhile(100);
        app.popStr("hsuncho");
        app.gugudanTable();
    }
}
