package javabase.chap_06;

// 실행 결과
// 이름 : 나**
// 주민등록번호 : 990130-1******
// 전화번호 : 010-1234-****

// 힌트
// substring()
// length()

public class _Quiz_06 {

    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index);
        for (int i=0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }


    public static void main(String[] args) {
        String name = "최안준";
        String number = "920905-1066920";
        String phoneNumber = "010-5811-2863";

        System.out.println(getHiddenData(name, 1));
        System.out.println(getHiddenData(number, 8));
        System.out.println(getHiddenData(phoneNumber, 9));
    }
}
