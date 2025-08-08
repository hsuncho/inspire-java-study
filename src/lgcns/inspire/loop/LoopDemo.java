package lgcns.inspire.loop;

public class LoopDemo {
    /*
        배열 또는 Collection(List, Set, Map)
        반복구문 : for, while ~ , do ~ while
        
        - for : 반복횟수가 정의되어 있을 때
        for(초기식; 조건식; 증감식) {
        
        }
        
        - while, do ~ while : 반복횟수가 정의되어 있지 않고 어떤 상황이 올 때까지 반복
        - while : 한 번도 구문을 수행하지 않을 수 있는 상황
        초기식;
        while(조건식) {
            statement;
            증감식;
        }

        - do ~ while : 무조건 한 번은 반복구문을 수행
        초기식;
        do {
            statement;
            증감식;
        } while(조건식)

        Stream Api
        - lambda expression
        - 4가지 함수형 (Supplier, Consumer, Function, Predicate) 인터페이스
        */

    public int sumOneToTen(int startIdx, int endIdx) {
        int sum = 0;
        for(int idx = startIdx; idx <= endIdx; idx++) {
            sum += idx;
        }
        return sum;
    }

    // 1 ~ 100 사이의 난수를 발생시켜서 해당 난수의 합을 구한다면?
    public void sumRandom() {
        int nan = (int) (Math.random() * 100) + 1;
        System.out.println("난수 : " + nan);
        int idx = 0;
        int sum = 0;
        while(idx <= nan) {
            sum += nan;
            idx++;
        }
        System.out.printf("발생된 난수의 합은 : %d\n", sum);
    }

    // break;
    /* 
    입력값 number = 100;
    매개변수로 입력받은 값을 1 ~ 차례로 누적하여 합을 구하다가
    입력받은 값을 넘으면 중단
    마지막으로 더해진 값과 그때까지의 합을 출력
    */

    public void loopBreak(int number) {
        int sum = 0, lastValue = 0;

        for (int i = 1; ; i++) {
            if (sum > number) {
                break;
            }
            sum += i;
            lastValue = i;
        }
        // %d : 정수, %f : 실수, %s : 문자열
        System.out.printf("lastValue = %d , sum = %d\n", lastValue, sum);
    }
    
    public void loopBreakWhile(int num) {
        int sum = 0, idx = 0;
        while(true) {
            if(sum > num) {
                break;
            }
            sum += idx;
            idx++;
        }
        System.out.printf("idx = %d , sum = %d\n", idx - 1, sum);
    }

    public void popStr(String str) {
        System.out.println(">>> params = " + str);
        for(int idx = 0; idx < str.length(); idx ++) {
            System.out.print(str.charAt(idx) + "\t");
        }
        System.out.println();
    }

    public void gugudanTable() {
        outer :
        for(int dan = 2 ; dan <= 9 ; dan++) {
            for(int col = 1 ; col <= 9 ; col++) {
                
                // 4단까지 출력하고 완전하게 루프를 빠져나가고 싶다면?
                if( dan == 5) {
                    break outer; 
                }
                System.out.printf("%d * %d = %d\t" , dan, col , (dan*col) ); 
            }
            System.out.println();
        }
    }
    
}
