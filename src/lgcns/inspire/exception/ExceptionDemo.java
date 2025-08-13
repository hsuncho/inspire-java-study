package lgcns.inspire.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
- 컴파일 시점 예외
- 런타임 시점 예외

try {
    예외 발생 코드
} catch (발생된 예외 객체 정의) {
    예외 발생 시 수행되는 블럭
} finally {
    예외 발생 여부와 상관 없이 무조건 수행 블럭
}

함수형 인터페이스(value + variance) : 베이버
Try.of(예외발생 가능 코드)
    .onFailure() -> 예외시 처리
    .getOrElse() -> 실패시 특정 값을 반환
*/

public class ExceptionDemo {
    public void printArr(String [] arr) {
        System.out.println(">>> arr print start");
        try {
            for(int idx=0; idx<= arr.length; idx++) {
                System.out.println(arr[idx]);
            }
            System.out.println(">>> inner try");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println(">>> 예외 여부와 상관 없이 수행하는 블럭");
        }
        System.out.println(">>> arr print end");
    }
    public String readConsole() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("input data : ");
        String data = null;
        try {
            data = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void first(int x) {
        System.out.println(">>> first start");
        second(x);
        System.out.println(">>> first end");
    }
    public void second(int x) {
        System.out.println(">>> second start");
        try {
            third(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(">>> second end");
    }
    public void third(int x) throws Exception{
        System.out.println(">>> third start");
        try { 
            if(x < 0) {
                throw new Exception("양수를 입력해주세요");
            }
        } finally {
            System.out.println(">>> third end");
        }
    }
}
