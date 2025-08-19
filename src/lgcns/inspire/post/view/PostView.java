package lgcns.inspire.post.view;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import lgcns.inspire.post.controller.PostController;
import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.front.FrontController;

public class PostView {
    private Scanner scan;

    // Dependency Injection (DI)
    // private PostController controller;

    private FrontController front;

    public PostView() {
        scan = new Scanner(System.in);
        // controller = new PostController();
        front = new FrontController();
    }
    public void mainMenu() {
        while(true) {
            System.out.println(">>> Inspire Camp Post Ver(1.0)");
            System.out.println("1. 전체 검색");
            System.out.println("2. 게시글 상세보기");
            System.out.println("3. 입력 폼으로 이동");
            System.out.println("4. 수정 페이지 이동");
            System.out.println("5. 삭제하기");
            System.out.println("6. 게시글 작성자로 검색");
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
                case 4 :
                    update();
                    break;
                case 5 :
                    delete();
                    break;
                case 6 :
                    serachByWriter();
                    break; 
                case 99 :
                    boolean flag = front.save("save");
                    if(flag) {
                        System.out.println("데이터 저장 후 포스트 앱 수행을 종료합니다");
                        System.exit(0) ;
                    } else {
                        System.out.println("데이터 저장 실패!!");
                    }
                    break ;
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
        List<PostResponseDTO> list = front.list("list");
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
        Optional<PostResponseDTO> result = front.findPost("find", id);

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
        int result = front.insert("insert", title, content, writer);
        System.out.println(result == 1 ? "입력 성공" : "입력 실패");
    }
    public void delete() {
        System.out.println();
        System.out.println(">>> post id <<<");
        System.out.print(">>> 게시글의 아이디를 입력 : ");
        int id = Integer.parseInt(scan.nextLine());
        int deleteFlag = front.delete("delete", id);
        System.out.println((deleteFlag == 1) ? "삭제 완료" : "삭제 실패");
    }
    /*
    - 수정폼으로 부터 title, content, id 입력받고 싶다
    - 입력받은 데이터를 front.update("update", title, content, id) 전달
    - front ctrl 쪽에서는 Factory의 도움을 받아서 PostUpdateCtrl 객체 반환받고
    - 해당 객체의 update(title, content, id) 전달해서 수행여부로 int 형 값을 반환
    */
    public void update() {
        System.out.println();
        System.out.println(">>> id, title, content <<<");
        System.out.print(">>> 게시글의 번호 : ");
        int id = Integer.parseInt(scan.nextLine());
        System.out.print(">>> 제목 : ");
        String title = scan.nextLine();
        System.out.print(">>> 내용 : ");
        String content = scan.nextLine();
        int result = front.update("update", id, title, content);
        System.out.println((result == 1) ? "수정 완료" : "수정 실패");
    }
    public void serachByWriter() {
        System.out.println();
        System.out.println(">>> post search writer <<<");
        System.out.print(">>> 작성자 입력 : ");
        String writer = scan.nextLine();
        
        // List<PostResponseDTO> result = front.searchByWriter("searchByWriter", writer);
        // if(result.isEmpty()) {
        //     System.out.println(">>> 게시글 없음");
        // } else {
        //     result.stream()
        //     .forEach(post -> {
        //         System.out.println(post.getId());
        //         System.out.println(post.getTitle());
        //         System.out.println(post.getWriter());
        //     });
        // }
        Optional<List<PostResponseDTO>> result = front.searchByWriter("searchByWriter", writer);
        result.ifPresentOrElse(
            posts -> posts.forEach(System.out::println),
            () -> System.out.println(writer + "님이 작성한 게시글이 존재하지 않습니다."));
    }
}
