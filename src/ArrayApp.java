import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class ArrayApp {
    public static void main(String[] args) {
        /*
        배열(Array)
        - 고정 길이를 갖는다(리사이징 x)
        - 단일 타입만 담는 그릇(기본, 참조)
        - 참조타입으로 취급(객체생성 후 사용 가능)
        - length 속성을 통해서 배열의 길이를 확인
        - 첨자번지는 0 ~ 
        - []
        */

        // int[] arr = new int[10];
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(">>> arr length : " + arr.length);
        for (int idx = 0; idx < arr.length; idx++ ) {
            System.out.println(arr[idx]);
        }
        System.out.println();
        System.out.println(">>> enhanced loop");
        for(int data : arr) {
            System.out.println(data);
        }

        System.out.println(">>> 참조타입의 객체를 배열에 담는다면? ");
        PostResponseDTO[] postArr = new PostResponseDTO[10];

        // Builder Pattern 을 이용한 객체 생성 방법
        PostResponseDTO data = PostResponseDTO.builder()
                                    .title("빌더패턴")
                                    .build();
        System.out.println(">>> getter call : " + data.getTitle());
        postArr[0] = data;

        for(PostResponseDTO dto: postArr) {
            if( dto != null) {
                System.out.println(">>> title : " + dto.getTitle());
            }
        }
        System.out.println(">>> main end <<<");
    }
}
