import lgcns.Student;

public class StudentApp {
    public static void main(String[] args) {
        Student instance = new Student();
        System.out.println("[debug] >>>> " + instance);
        System.out.println("[debug] >>>> " + instance.name);
        System.out.println("[debug] >>>> " + instance.gender);
        instance.name = "hsun";
        instance.gender = 'F';
        System.out.println("[debug] >>>> " + instance.name);
        System.out.println("[debug] >>>> " + instance.gender);
        instance.StuInfo();
    }

}
