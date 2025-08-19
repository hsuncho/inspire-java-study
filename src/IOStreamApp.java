import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class IOStreamApp {
    public static void main(String[] args) {
        // System.out.print(">>> stream 이용한 데이터 입력 : ");
        // try {
            //     int input = System.in.read();
            //     System.out.println(">>> result : " + input);
            // } catch (IOException e) {
                //     e.printStackTrace();
                // }
                
        // char stream
        // System.out.print(">>> stream 이용한 데이터 입력 : ");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try {
        //     String input = br.readLine();
        //     System.out.println(">>> result : " + input);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        
        // 9 AutoClosable
        // try() {} catch() {}
        
        // System.out.println(">>> 파일에 데이터(문자열, 객체, etc...) 저장하기");
        // String data = "Outputting to a file using IO streams.";
        // try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("./test.txt")))) {
        //     bw.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        List<PostResponseDTO> posts = new ArrayList<>(Arrays.asList(
            PostResponseDTO.builder()
                            .id(1)
                            .title("mvc")
                            .content("springboot")
                            .writer("hsuncho")
                            .build(),
            PostResponseDTO.builder()
                            .id(2)
                            .title("stream api")
                            .content("기초문법")
                            .writer("hsuncho")
                            .build(),
            PostResponseDTO.builder()
                            .id(3)
                            .title("lambda")
                            .content("함수형 인터페이스")
                            .writer("lgcns")
                            .build(),
            PostResponseDTO.builder()
                            .id(4)
                            .title("springboot")
                            .content("pattern 조합")
                            .writer("inspire")
                            .build()
        ));

        // System.out.println(">>> 직렬화된 객체를 파일에 저장");
        // try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./test.txt"))) {
        //     oos.writeObject(posts);
        //     System.out.println(">>> 직렬화된 객체 파일에 저장 완료");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./test.txt"))) {
            posts.clear();
            posts = (List<PostResponseDTO>) ois.readObject();
            posts.stream()
                .forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
