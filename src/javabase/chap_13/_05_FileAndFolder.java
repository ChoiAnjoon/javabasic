package javabase.chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // String folder = "."; 상대경로
        // String folder = "C:\\dev\\javaWorkspace\\src\\chap_13";
        String folder = "./src/chap_13";
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsoluteFile());

        for (File file : filesAndFolders.listFiles()) { // 모든 폴더와 파일 정보를 얻어올수 있음.
            if (file.isFile()) {
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
            // System.out.println(file.getName());
        }

    }
}
