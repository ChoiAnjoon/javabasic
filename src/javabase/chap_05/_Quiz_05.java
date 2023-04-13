package javabase.chap_05;

// 신발 사이즈는 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250 (재고 있음)
// 사이즈 255 (재고 있음)
// ...

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoes = new int[10];

        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = 250 + (5 * i);
        }

        for (int shoe : shoes) {
            System.out.println("사이즈 : " + shoe + " (재고있음)");
        }
    }
}
