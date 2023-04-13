package javabase.chap_11;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;

        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림을 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("------------------------");
        // try 구문 내에서 사용할 어떠한 resource, 파일 객체를 괄호 속에서 정의 하면
        // 자동으로 try catch 구문을 빠져 나올떄 close 를 호출
        // 한가지 조건 : 이 객체는 autocloseable 라는 인터페이스를 구현해 주어야 함
        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("빵이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}