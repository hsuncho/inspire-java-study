package lgcns.inspire.post.view;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import lgcns.inspire.post.controller.PostController;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class PostView {
    private Scanner scan;

    // Dependency Injection (DI)
    private PostController controller;

    public PostView() {
        scan = new Scanner(System.in);
        controller = new PostController();
    }
    public void mainMenu() {
        while(true) {
            System.out.println(">>> Inspire Camp Post Ver(1.0)");
            System.out.println("1. 전체 검색");
            System.out.println("2. 게시글 상세보기");
            System.out.println("3. 입력 폼으로 이동");
            System.out.println("4. 수정 페이지 이동");
            System.out.println("5. 삭제하기");
            System.out.println("99. 프로그램 종료");
            System.out.print("번호를 선택하세요 : ");
            int number = Integer.parseInt(scan.nextLine());
            switch(number) {
                case 1 :
                    list();
                    break;
                case 2 :
                    read();
                    break;
                case 3 :
                    insert();
                    break;
                case 99 :
                    System.out.println("포스트 앱 수행을 종료합니다.");
                    System.exit(0);
                    break;
                default :
                    System.out.println("선택하신 번호는 작업 수행이 불가합니다.");
            }
        }
    } // mainMenu end
    /*
     * 컨트롤러에게 데이터를 요청하고 전달받은 값을 출력하는 역할
    */
    public void list() {
        System.out.println();
        System.out.println(">>> 데이터 출력 <<<");
        List<PostResponseDTO> list = controller.list();
        System.out.println("view list data : " + list);
        
        // 1.8 version
        // stream api 이용해서 출력
        // list.stream()
        //     .forEach(System.out::println);

        // 특정 속성에 대한 정보만 추출(title)
        list.stream()
            .map(PostResponseDTO::getTitle)
            .forEach(System.out::println);

        // list.stream()
        //     .filter(post -> post.getId() >= 2)
        //     .forEach(System.out::println);
    }
    public void read() {
        System.err.println();
        System.out.println(">>> 특정 게시물 상세보기 <<<");

        System.out.print("게시글 번호를 입력 : ");
        int id = Integer.parseInt(scan.nextLine());
        Optional<PostResponseDTO> result = controller.findPost(id);

        if(result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println(">>> 특정 게시물 찾기 실패!");
        }
    }
    public void insert() {
        System.out.println();
        System.out.println(">>> title, content, writer <<<");
        System.out.print(">>> 제목 : ");
        String title = scan.nextLine();
        System.out.print(">>> 내용 : ");
        String content = scan.nextLine();
        System.out.print(">>> 작성자 : ");
        String writer = scan.nextLine();

        /*
        요구사항)
        - 입력받은 3개의 파라미터를 ctrl 에 전달(메서드정의)
        - 반환타입 int 형으로 1이 넘어오면 정상 , 0 이면 입력실패

        - 전달된 파라미터를 PosResponseDTO 객체로 바인딩하고
        - 기본키 값은 size() + 1 로 id 값을 할당
        - service 로 전달하고
        - service 는 dao 전달
        - dao 기존 list 에 전달받은 request 객체를 담고
        - 성공이면 1, 실패면 2 반환
        */

        // int result = controller.insertPost(title, content, writer);
        int result = controller.insert(title, content, writer);
        System.out.println(result == 1 ? "입력 성공" : "입력 실패");
    }
}
