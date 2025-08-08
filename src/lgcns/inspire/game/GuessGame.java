package lgcns.inspire.game;

import java.util.Scanner;

public class GuessGame {

    // 1 ~ 100 난수 생성 후 반환
    public static int generatorNan() {
        return (int) (Math.random() * 100) + 1;
    }

    /*
    기회는 총 10번 
    - 매개변수로 정답을 전달받고
    - 반환값으로
    -- 성공) xx번째 정답을 맞혔습니다!
    -- 실패) 10번의 기회를 모두 사용하였습니다.
    */
    public static String gameStart(int answer) {
        Scanner scan = new Scanner(System.in);
        for(int idx = 0; idx < 10; idx++) {
            System.err.print("정답을 입력하세요 : ");
            int guess = scan.nextInt();
            System.out.printf("당신의 생각은 %d 이네요" , guess);
            if(guess == answer) {
                return idx + "번째 정답을 맞혔습니다!";
            } 
            System.out.println(guess > answer ? "down!" : "up!");
        }
        return "10번의 기회를 모두 사용하였습니다.";
    }
}
