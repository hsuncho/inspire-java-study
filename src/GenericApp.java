import lgcns.inspire.generic.ErrorCode;

public class GenericApp {
    public static void main(String[] args) {
        ErrorCode<Integer> err = new ErrorCode<>();
        err.setCode(404);
        System.out.println(err.getCode());

        ErrorCode<String> msg = new ErrorCode<>();
        msg.setCode("Not Found");
        System.out.println(msg.getCode());
    }
}