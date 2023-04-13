package javabase.chap_11.quiz12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        try {
            if (Validator.validate(path)) {
                System.out.println(path + " 파일이 존재합니다.");
            } else {
                System.out.println(path + "파일이 존재하지 않습니다.");
            }
        } catch (IllegalPathAccessError illegalPathAccessError) {
            System.out.println(illegalPathAccessError.getMessage());
            illegalPathAccessError.printStackTrace();
            System.out.println("프로그램을 종료합니다. ");
            System.exit(1);
        }

    }
}
