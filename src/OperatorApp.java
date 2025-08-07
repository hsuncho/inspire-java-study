import lgcns.inspire.operator.Operator;

public class OperatorApp {
 
    public static void main(String[] args) {
        
        Operator app = new Operator();
        app.exmple01();
        String str = app.example02("A", "B");
        System.out.println(str);
    }
}
